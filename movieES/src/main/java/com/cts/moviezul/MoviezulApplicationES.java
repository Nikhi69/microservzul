package com.cts.moviezul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class MoviezulApplicationES {

	public static void main(String[] args) {
		SpringApplication.run(MoviezulApplicationES.class, args);
	}

}
