package com.zipkin.zipkincli;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ZipkinCliApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZipkinCliApplication.class, args);
	}
}
