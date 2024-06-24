package com.martins.eventapi.Eventos_API;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
public class EventosApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventosApiApplication.class, args);
	}

}
