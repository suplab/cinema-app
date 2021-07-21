FROM openjdk:8-jdk-alpine
MAINTAINER beingsuplab
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} reviews-api.jar
ENTRYPOINT ["java","-jar","/reviews-api.jar"]