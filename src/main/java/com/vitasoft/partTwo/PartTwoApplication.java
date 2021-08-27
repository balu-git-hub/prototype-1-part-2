package com.vitasoft.partTwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.vitasoft.repository.UserRepository;

@SpringBootApplication
@ComponentScan(basePackages={"com.vitasoft"})
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
@EntityScan(basePackages = "com.vitasoft.model")
public class PartTwoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PartTwoApplication.class, args);
	}

}
