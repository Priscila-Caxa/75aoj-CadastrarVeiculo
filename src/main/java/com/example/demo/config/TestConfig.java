package com.example.demo.config;

import com.example.demo.resources.Autowired;
import com.example.demo.services.DBService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.text.ParseException;

@Configuration
@Profile("test")
public class TestConfig {

	/**
	 *
	 */
	@Autowired
	final
	ThreadLocal<DBService> dbService = new ThreadLocal<DBService>();
	
	@Bean
	public boolean instantiateDatabase() throws ParseException {
		dbService.get().instantiateTestDataBase();
		return true;
	}

}
