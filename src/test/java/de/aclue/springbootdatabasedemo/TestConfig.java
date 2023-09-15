package de.aclue.springbootdatabasedemo;

import org.springframework.boot.devtools.restart.RestartScope;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.springframework.context.annotation.Bean;
import org.testcontainers.containers.PostgreSQLContainer;

@TestConfiguration
public class TestConfig {

  /*
   * @Bean -> spring boot starts and stops db container automatically
   *
   * @RestartScope -> bean is reused, when app is restarted by dev tools. So the data in the database is still there.
   *
   * @ServiceConnection -> Testcontainers support - connection details are set automatically.
   */
  @Bean
  @RestartScope
  @ServiceConnection
  PostgreSQLContainer<?> postgreSQLContainer() {
    return new PostgreSQLContainer<>(
        "postgres:15-alpine"
    );
  }

}
