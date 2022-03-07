package com.example.Restlearning;

import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication //spring context,enables auto scan of package,enables auto configuration
public class RestWebServicesApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext= SpringApplication.run(RestWebServicesApplication.class,args); // run spring context and return application context
		for(String name:applicationContext.getBeanDefinitionNames())
		{
			System.out.println(name);
		}

		//SpringApplication.run(RestWebServicesApplication.class, args);
	}

}
