package com.dsi.tp1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class OrdreApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrdreApplication.class, args);
	}

}
