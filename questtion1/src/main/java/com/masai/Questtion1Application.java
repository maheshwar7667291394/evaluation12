package com.masai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Questtion1Application {

	public static void main(String[] args) {
	  ApplicationContext	ctx=SpringApplication.run(Questtion1Application.class, args);
	  System.out.println(ctx.getApplicationName());
	
	  
	  PersonService p1=ctx.getBean("personService",PersonService.class);
	  p1.printmap();
	  p1.printList();
	 
	 
	  
	}

}
