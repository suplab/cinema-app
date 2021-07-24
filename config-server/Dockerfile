FROM openjdk:8-jdk-alpine
MAINTAINER beingsuplab
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} config-server.jar
ENTRYPOINT ["java","-jar","/config-server.jar"]