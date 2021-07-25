FROM openjdk:8-jdk-alpine
MAINTAINER beingsuplab
WORKDIR /app
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} /app/config-server.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app/config-server.jar"]