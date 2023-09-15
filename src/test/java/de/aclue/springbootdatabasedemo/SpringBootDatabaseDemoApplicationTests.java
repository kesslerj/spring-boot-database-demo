package de.aclue.springbootdatabasedemo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.testcontainers.junit.jupiter.Testcontainers;

@Testcontainers
@SpringBootTest
@Import(TestConfig.class)
class SpringBootDatabaseDemoApplicationTests {

  @Test
  void contextLoads() {
  }

}
