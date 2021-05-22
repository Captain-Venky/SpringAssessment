package com.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import com.model.DatabaseDetails;

@Configuration
@PropertySource("classpath:/database.properties")
public class MyConfiguration {
	
	@Autowired
    Environment env;
     
    @Bean(name="db")
    public DatabaseDetails getDbConfig(){
         
        DatabaseDetails db = new DatabaseDetails();
        db.setHost(env.getProperty("database.host.url"));
        db.setPort(env.getProperty("database.port.number"));
        db.setService(env.getProperty("database.service.name"));
        db.setUrl(env.getProperty("database.user"));
        db.setPassword(env.getProperty("database.password"));
        return db;
    }

}
