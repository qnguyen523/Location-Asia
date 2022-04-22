package com.example.demo;

import org.springframework.boot.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Controller;
@SpringBootApplication
@Controller
public class DemoApplication implements ApplicationRunner {
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@RequestMapping(value = "/")
   	public String home() {
      	// return "Hello Location.asia";
		  /*
		  The control is redirected into the home.html file.
		  */
		return "home";
	}
	@Override
	// Execute the code after the Spring Boot application started
   	public void run(ApplicationArguments arg0) throws Exception {
    	// System.out.println("Hello World from Application Runner");
   	}
}
