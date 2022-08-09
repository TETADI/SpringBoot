package com.springboot.beanintro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component 
public class Laptop 
{
	@Autowired
	Processor p;
	
public void harddisk()
{
	System.out.println("Injecting Harddisk");
	p.intel();
}

}
