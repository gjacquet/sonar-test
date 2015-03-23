package com.github.jacquet.sonar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {
	@Bean
	public SomeService someService() {
		return new SomeService();
	}

	@Bean
	public Test test() {
		return new Test();
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);
	}
}
