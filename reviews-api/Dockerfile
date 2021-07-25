FROM openjdk:8-jdk-alpine
MAINTAINER beingsuplab
WORKDIR /app
# Add wait script to the image - script pulled from https://github.com/ufoscout/docker-compose-wait/releases/download/2.7.3/wait /wait
COPY /scripts/wait /app/
RUN chmod -R +x /app
RUN apk --no-cache add curl
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} /app/reviews-api.jar
CMD ./wait && java -Djava.security.egd=file:/dev/./urandom -jar reviews-api.jar