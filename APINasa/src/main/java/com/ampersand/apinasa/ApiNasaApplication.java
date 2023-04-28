package com.ampersand.apinasa;

import java.util.Timer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.ampersand")
@SpringBootApplication
public class ApiNasaApplication {

	public static void main(String[] args) {
		Timer timer = new Timer();
		Rutina tarea = new Rutina();
        timer.schedule(tarea, 0, 60*1000); // Run the task every minute
		SpringApplication.run(ApiNasaApplication.class, args);
	}

}
