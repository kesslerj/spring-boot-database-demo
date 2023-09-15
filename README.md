# Spring Boot Database Demo
Simple demo project with
- Flyway
- Postgres database dialect
- Spring Data JPA

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