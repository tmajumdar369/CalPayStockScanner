package com.example.CalPay.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import calPayPackage.CalPay;
import calPayPackage.CalPayRunner;

@Configuration
@ComponentScan("calPayPackage")
public class DemoApplication {

	public static void main(String[] args) {
		try(
			var context = new AnnotationConfigApplicationContext(CalPay.class)){
			context.getBean(CalPay.class);
			context.getBean(CalPayRunner.class).run();
		}
	}

}
