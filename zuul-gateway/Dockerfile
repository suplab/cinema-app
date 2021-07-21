FROM openjdk:8-jdk-alpine
MAINTAINER beingsuplab
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} zuul-gateway.jar
ENTRYPOINT ["java","-jar","/zuul-gateway.jar"]