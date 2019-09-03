package com.trilogyed.cloudconfigstwitter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class CloudConfigStwitterApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudConfigStwitterApplication.class, args);
	}

}
