package com.server.kmoim.api;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages={"com.server.kmoim.api.mappers"})
@SpringBootApplication
public class KmoimApplication {

	public static void main(String[] args) {
		SpringApplication.run(KmoimApplication.class, args);
	}

}
