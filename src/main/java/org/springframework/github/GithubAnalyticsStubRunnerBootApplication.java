package org.springframework.github;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.contract.stubrunner.server.EnableStubRunnerServer;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;

@SpringBootApplication
@AutoConfigureStubRunner
@EnableStubRunnerServer
public class GithubAnalyticsStubRunnerBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(GithubAnalyticsStubRunnerBootApplication.class, args);
	}
}
