package com.springboot.beanintro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BeanintroApplication 
{

	public static void main(String[] args) 
	{
		ConfigurableApplicationContext c = SpringApplication.run(BeanintroApplication.class, args);
		
		Laptop l = c.getBean(Laptop.class);
		l.harddisk();
	}

}

