package com.example.order.api;

import com.example.order.api.controller.OrderController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

//@AutoConfigureAfter({ DataSourceAutoConfiguration.class })
@SpringBootApplication
//@EnableAutoConfiguration
//@ComponentScan
public class OrderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderServiceApplication.class, args);

	}

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();


	}
}