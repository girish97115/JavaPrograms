package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.demo.beans.*;
import com.example.demo.config.MyApplicationConfig;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(MyApplicationConfig.class);
		MyDbConfig dbConfig = (MyDbConfig) context.getBean("dbConfig");
		System.out.println(dbConfig.toString());
	}

}
