package com.f3pro.todo.configuration;

import com.f3pro.todo.services.DBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.text.ParseException;

@Configuration
@Profile("dev")
public class DevConfig {
	
	@Autowired
	private DBService dbService;
	
	@Bean
	public boolean instancia() throws ParseException {
		this.dbService.instanciaBaseDeDados();
		return true;
	}

}
