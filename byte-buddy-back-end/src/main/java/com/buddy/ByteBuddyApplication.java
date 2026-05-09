package com.buddy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ByteBuddyApplication {	
	public static void main(String[] args) {
		SpringApplication.run(ByteBuddyApplication.class, args);
	}
}
