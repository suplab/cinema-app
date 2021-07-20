#!/usr/bin/env bash

docker rmi beingsuplab/eureka-discovery:1.0.0
docker rmi beingsuplab/zuul-gateway:1.0.0
docker rmi beingsuplab/reviews-api:1.0.0
docker rmi beingsuplab/movies-api:1.0.0
docker rmi mcinema-app_filebeat:latest