package com.ecarevault;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class HookServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HookServiceApplication.class, args);
	}

}
