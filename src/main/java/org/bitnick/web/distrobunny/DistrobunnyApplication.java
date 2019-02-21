package org.bitnick.web.distrobunny;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@SpringBootApplication
public class DistrobunnyApplication {

	public static void main(String[] args) {
		SpringApplication.run(DistrobunnyApplication.class, args);
	}
}
