package me.indiwide.indiwide;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Import;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
@Import(Config.class)
public class IdiwideApplication {

	public static void main(String[] args) {
		SpringApplication.run(IdiwideApplication.class, args);
	}
	
}
