package com.seamless.firstProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Use scan base if package outside main
/* @SpringBootApplication(
	 scanBasePackages = {
		"com.seamless.firstProject",
		"util"
     }
   ) */
@SpringBootApplication()
public class FirstProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstProjectApplication.class, args);
	}

}
