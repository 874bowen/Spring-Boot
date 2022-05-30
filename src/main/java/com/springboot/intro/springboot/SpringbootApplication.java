package com.springboot.intro.springboot;

import com.springboot.intro.springboot.aop.business.Business1;
import com.springboot.intro.springboot.aop.business.Business2;
import org.apache.catalina.core.ApplicationContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
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

// implemented a commandlineRunner and autowired our dependencies and called them in the run method
@SpringBootApplication
public class SpringbootApplication implements CommandLineRunner {
	// use LOGGER
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	// good thing now we can autowire stuff and configure them outside the static method
	@Autowired
	private Business1 business1;

	@Autowired
	private Business2 business2;
	public static void main(String[] args) {
		// run method used to run spring context and returns an applicationContext
		SpringApplication.run(SpringbootApplication.class, args);

//		for (String name : applicationContext.getBeanDefinitionNames()){
//			System.out.println(name);
//		}
	}
	// run method is defined in the commandlinerunner
	// whenever the springbootapplication launches up it also calls the run method
	@Override
	public void run(String... args) throws Exception {
		logger.info(business1.calculateSomething());
		logger.info(business2.calculateSomething());
	}
}
