# cinema-app
The goal of this project is to implement two [Spring Boot](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/) application, called `movies-api` and `reviews-api`, and use [`Filebeat`](https://www.elastic.co/beats/filebeat) &`ELK Stack` ([`Elasticsearch`](https://www.elastic.co/elasticsearch), [`Logstash`](https://www.elastic.co/logstash) and [`Kibana`](https://www.elastic.co/kibana)) to collect and visualize application's **logs** and [`Prometheus`](https://prometheus.io/) & [`Grafana`](https://grafana.com/) to monitor application's **metrics**.  
Additionally there is a `Eureka` server for client-side discovery and a `Zuul` api-gateway.

## Application
### movies-api
`Spring Boot` Web Java application that exposes a REST API for managing movies. This app uses a `Feign` client with `Hystrix` circuit-breaker to retrive info from the `reviews-api` app.

### reviews-api
`Spring Boot` Web Java application that exposes a REST API for managing reviews of movies.

## Prerequisites

* [`Java 8+`](https://www.oracle.com/java/technologies/javase-jdk8-downloads.html)
* [`Docker`](https://www.docker.com/)
* [`Docker-Compose`](https://docs.docker.com/compose/install/)

## Start Environment

* Open a terminal and inside root folder and run
  ```shell
  docker-compose up -d
  ```

* Wait a bit until containers be `Up (healthy)` (except `filebeat`). In order to check it run
  ```shell
  docker-compose ps
  ```
## Running application with Maven

- Open a terminal and make sure you are inside root folder

- Run the following command
  ```
  ./mvnw clean spring-boot:run --projects movies-api
  
  ./mvnw clean spring-boot:run --projects reviews-api
  ```  
  
## Application ports
  * movies-api : 8081
  * reviews-api : 8082
  * eureka: 8761
  * zuul: 8762
  * graphana : 3000
  * prometheus : 9090
  * kibana : 5601
  * elasticsearch : 9200

## Shutdown

- To stop application
  - If it was started with Maven, go to the terminals where it is running and press `Ctrl+C`
  - If it was started as a Docker container, go to a terminal and run the command below
    ```shell
    docker stop movies-api
    
    docker stop reviews-api
    
    ```
- To stop and remove `docker-compose` containers, network and volumes, go to a terminal and, inside root folder, run the following command
  ```
  docker-compose down -v
  ```

## Cleanup

To remove the Docker images created by this project, go to a terminal and, inside root folder, run the script below
```
./remove-docker-images.sh
```
 
## Check DB
```sql
mysql> update user set host='%' where user='root';
mysql> flush privileges;
mysql> grant all privileges on *.* to 'root'@'localhost';
mysql> flush privileges;
```
