package com.example.jdbc_db_project2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.jdbc_db_project2.accessingdatamysql.model.Alien;

@SpringBootApplication
public class JdbcDbProject2Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(JdbcDbProject2Application.class, args);

		Alien alien1 = context.getBean(Alien.class);
		alien1.setId(111);
		alien1.setName("Navin");
		alien1.setTech("Java");
	}

}
