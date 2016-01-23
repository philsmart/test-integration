package uk.ac.cardiff.idman.test.integration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:integration.xml")
public class TestIntegrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestIntegrationApplication.class, args);
	}
}
