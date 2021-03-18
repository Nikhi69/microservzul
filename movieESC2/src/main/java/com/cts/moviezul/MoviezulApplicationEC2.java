package com.cts.moviezul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class MoviezulApplicationEC2 {

	public static void main(String[] args) {
		SpringApplication.run(MoviezulApplicationEC2.class, args);
	}

}
