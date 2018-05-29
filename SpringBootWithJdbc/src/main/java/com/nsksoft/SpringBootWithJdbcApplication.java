package com.nsksoft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nsksoft.repositry.CustomerRepositry;

@SpringBootApplication
public class SpringBootWithJdbcApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootWithJdbcApplication.class, args);
		CustomerRepositry orgrepo = context.getBean(CustomerRepositry.class);
                         orgrepo.getCustomer("7013806228");
	}
}
