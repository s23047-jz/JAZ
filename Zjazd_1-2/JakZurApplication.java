package pl.pjatk.JakZur;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:bean-config.xml")
public class JakZurApplication {

	public static void main(String[] args) {
		SpringApplication.run(JakZurApplication.class, args);
	}

}
