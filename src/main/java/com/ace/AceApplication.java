package com.ace;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AceApplication {
	public static void main(String[] args) {
		SpringApplication.run(AceApplication.class, args);
	}

}
//base url :

// to get list of course 
// http://localhost:8080/api/courses

// to add a new course:
//URL : http://localhost:8080/api/add
//body : {"id":52,"topic":"Python","course":"exp","language":"English","duration":"6 weeks","cost":"900","experiance":"experienced"}

//to search all params
//URL : http://localhost:8080/api/coursesbycost?topic=java&cost=89&language=English&duration=6 weeks&experience=experienced

//to access H2 database
//URL : http://localhost:8080/h2-ui/
// database url : jdbc:h2:mem:acedb