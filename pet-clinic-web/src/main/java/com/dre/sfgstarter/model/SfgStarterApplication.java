package com.dre.sfgstarter.model;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.dre.sfgstarter"})
@SpringBootApplication
public class SfgStarterApplication {

	public static void main(String[] args) {
		SpringApplication.run(SfgStarterApplication.class, args);
	}

}
