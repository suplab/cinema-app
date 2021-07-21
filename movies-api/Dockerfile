FROM openjdk:8-jdk-alpine
MAINTAINER beingsuplab
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} movies-api.jar
ENTRYPOINT ["java","-jar","/movies-api.jar"]