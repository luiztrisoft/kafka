# kafka

[POST] http://localhost:8080/api/salvar-produto

{
	"descricao":"Playstation 4",
	"valor": 2300.00,
	"quantidade": 3
}


Antes de executar o consumidor e o produtor é ser necessário instalar o docker e docker-compose na maquina para executar o arquivo docker-compose.yml

## Step 1: Update Software Repositories
sudo apt-get update

## Step 2: Uninstall Old Versions of Docker
sudo apt-get remove docker docker-engine docker.io

## Step 3: Install Docker on Ubuntu 18.04
sudo apt install docker.io

## Step 4: Start and Automate Docker
sudo systemctl start docker
sudo systemctl enable docker

## Step 5 (Optional): Check Docker Version
docker --version

## Step 6: Installing docker-compose
sudo curl -L https://github.com/docker/compose/releases/download/1.21.2/docker-compose-`uname -s`-`uname -m` -o /usr/local/bin/docker-compose
sudo chmod +x /usr/local/bin/docker
docker-compose --version-compose

## Step 7: Starting docker-compose
sudo docker-compose -f docker-compose.yml up
