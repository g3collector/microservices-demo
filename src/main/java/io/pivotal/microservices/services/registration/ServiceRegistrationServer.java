package io.pivotal.microservices.services.registration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * All you need to run a Eureka registration server.
 * 
 * @author Paul Chapman
 */
@SpringBootApplication
@EnableEurekaServer
public class ServiceRegistrationServer {

	public static void main(String[] args) {
		// Tell server to look for registration.properties or registration.yml
		System.setProperty("spring.config.name", "registration");

		SpringApplication.run(ServiceRegistrationServer.class, args);
	}
}
