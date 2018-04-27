#!/usr/bin/env bash

docker stop spring-boot-dubbo-zookeeper
docker rm spring-boot-dubbo-zookeeper
docker run --name spring-boot-dubbo-zookeeper -p 2181:2181 --restart always -d zookeeper:3.5
