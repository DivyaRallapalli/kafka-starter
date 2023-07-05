package com.example.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.autoconfigure.security.servlet.ManagementWebSecurityAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication(exclude = {
		SecurityAutoConfiguration.class,
		ManagementWebSecurityAutoConfiguration.class
})
@EnableKafka
public class KafkaApplication {
	private static final Logger log=LoggerFactory.getLogger(KafkaApplication.class.getName());
	public static void main(String[] args) {
		SpringApplication.run(KafkaApplication.class, args);


	}
}
