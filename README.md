# Spring Boot Database Demo
Simple demo project with
- Flyway
- Postgres database dialect
- Spring Data JPA

This branch includes Testcontainers to have a separate postgres db available for integration tests.

Additionally, also the new **Testcontainers support** from Spring Boot 3.1 is used here. It makes the config even easier.

Check out 
- [this](https://spring.io/blog/2023/06/23/improved-testcontainers-support-in-spring-boot-3-1)  great blog article on the topic from Spring blog
- [this](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#features.testing.testcontainers) related section in the reference documentation 
- [this](https://testcontainers.com/guides/testing-spring-boot-rest-api-using-testcontainers/) guide from Testcontainer

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

## Native app

### Buildpacks
- result: docker image
- compilation only, no native testing
  - but tests must work!? executed non-native!?
- no GraalVM installation needed

- not working on ARM (e. g. M1 mac)?

#### Howto
Build docker image
```
mvn -Pnative spring-boot:build-image
```

Run docker image
```
TODO
```

### Native Build Tools
- needs local GraalVM installation
TODO

## Outstanding improvements
For a productive application with database, various improvements should still be made:
- Use Testcontainers to have a separate database for testing
- Different property files for the different environments
- JPA auditing
- Optimistic locking
- ...