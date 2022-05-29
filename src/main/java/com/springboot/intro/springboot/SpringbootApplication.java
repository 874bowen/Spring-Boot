package com.springboot.intro.springboot;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/* @SpringBootApplication ->
1. indicates that this is a Spring context class
2. enables AutoConfiguration
3. Enables ComponentScan intro & springboot for any beans BookController would be registered as a bean and would be managed by the
SpringFramework
SpringBoot looks at (a) Frameworks available on the CLASSPATH (b) Existing configuration for the application. Based on these,
SpringBoot provides basic configuration needed to configure the application with these frameworks . This is called
AUTO CONFIGURATION
*  */
@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {
		// run method used to run spring context and returns an applicationContext
		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringbootApplication.class, args);

		for (String name : applicationContext.getBeanDefinitionNames()){
			System.out.println(name);
		}
	}

}
