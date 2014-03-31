#!/bin/bash

# Install docker if you don't have it
[ ! -x "$(which docker)" ] && curl -sL https://get.docker.io/ | sh

# Install libvirt too
sudo apt-get install -y libvirt-bin python-libvirt python-pip

# Gonna need a ssh server
sudo apt-get install -y openssh-server

# CLI
pip install cattle

# Start Cattle
sudo docker run -d -p 8080:8080 cattle/server

# Download and authorize SSH key.
while true; do
        curl -s http://localhost:8080/v1/authorized_keys | sudo tee -a /root/.ssh/authorized_keys
        if [ ${PIPESTATUS[0]} == 0 ]; then
                break
        else
                echo Waiting
                sleep 5
        fi
done

# Register agent
curl -X POST http://localhost:8080/v1/agents
