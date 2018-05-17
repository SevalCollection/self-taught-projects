package com.mytutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@RestController
public class App 
{
	
	@RequestMapping("/myapp")
	public String hello() {
		return "Hello From Restful Webservice - Hello Restful World!" ;
	}
    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
    }
}
