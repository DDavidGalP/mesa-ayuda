package com.enyoi.apimesaayuda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class ApiMesaAyudaApplication {

	public static void main(String[] args) {

		SpringApplication.run(ApiMesaAyudaApplication.class, args);
	}

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/api-mesa-ayuda/**").allowedOrigins("http://api-mesa-ayuda-production.up.railway.app").allowedMethods("*").allowedHeaders("*");
			}
		};
	}

}
