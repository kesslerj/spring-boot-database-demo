# Spring Boot Database Demo
Simple demo project with
- Flyway
- Postgres database dialect
- Spring Data JPA

**Docker Compose Support** is enabled in this branch. Docker containers are automatically started, when starting the spring boot app. 
Also, running containers are detected. This feature is very nice for developing multiple service locally, because dynamic ports can be used 
and you don't have to remember to execute `docker compose up` and quit it afterwords. Compare this [blog article](https://spring.io/blog/2023/06/21/docker-compose-support-in-spring-boot-3-1) from the spring blog.

## Run

Start local postgres instance via docker compose:
```
docker compose up
```

Run app via maven wrapper
```
./mvnw spring-boot:run
```

Check that it is running with
```
http localhost:8080
```
using [httpie](https://github.com/httpie/cli) or simply open http://localhost:8080/ in your browser.

## Outstanding improvements
For a productive application with database, various improvements should still be made:
- Use Testcontainers to have a separate database for testing
- Different property files for the different environments
- JPA auditing
- Optimistic locking
- ...