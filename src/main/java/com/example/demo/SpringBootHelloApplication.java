package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@RestController
public class SpringBootHelloApplication {
	@Configuration
	public class WebMvc implements WebMvcConfigurer {
		@Override
		public void addCorsMappings(CorsRegistry registry) {
			registry.addMapping("/**")
					.allowedMethods("*")
					.allowedOrigins("*");
		}
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootHelloApplication.class, args);
	}

	@RequestMapping("/hello")
	public String hello() {
		return "Hello world";
	}

}
