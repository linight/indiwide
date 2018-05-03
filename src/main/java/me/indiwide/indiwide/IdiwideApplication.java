package me.indiwide.indiwide;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(Config.class)
public class IdiwideApplication {

	public static void main(String[] args) {
		SpringApplication.run(IdiwideApplication.class, args);
	}
	
}
