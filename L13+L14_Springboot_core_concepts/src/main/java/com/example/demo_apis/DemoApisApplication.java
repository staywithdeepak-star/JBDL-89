package com.example.demo_apis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sun.tools.jar.CommandLine;

@SpringBootApplication
public class DemoApisApplication implements CommandLineRunner {

    public DemoApisApplication() {
        System.out.println("Inside DemoApisApplication constructor...");
    }

    /**
     * Server or Embedded server or embedded container - Tomcat, Jetty, Undertow
     *
     * Tomcat is a server and spring-boot-starter-tomcat is an abstraction layer created by the spring boot developers
     * to collate all the boiler-plate code related to servlets and socket connections so that developers don't need to
     * write all those by themselves and they can focus on the core business logic of their apps
     *
     *
     * ERROR
     * WARN
     * INFO
     * DEBUG
     * TRACE -
     *
     * Default format of spring boot log:
     * Date T time  level   process-id  app-name    thread-name  class-path  actual log
     *
     *
     * If all the embedded server dependencies are present which will run
     * 1. tomcat
     * 2. jetty
     * 3. undertow
     * 4. error
     * 5. whichever is defined first in the pom.xml
     * @param args
     */


    @Autowired
    Person person;

	public static void main(String[] args) {
		SpringApplication.run(DemoApisApplication.class, args);
        System.out.println("Inside main function...");
	}

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Inside run function... thread = " + Thread.currentThread() + ", person = " + person);

    }
}
