package de.aclue.springbootdatabasedemo;

import org.springframework.boot.SpringApplication;

public class TestSpringBootDatabaseDemoApplication {

	/*
	 * This is a "test main". With this construct, we can use testcontainers at development time.
	 *
	 * Start via IDE or maven: ./mvnw spring-boot:test-run
	 */
	public static void main(String[] args) {
		SpringApplication
				// based on "real main"
				.from(SpringBootDatabaseDemoApplication::main)
				// reusing the test configuration
				.with(TestConfig.class)
				.run(args);
	}

}
