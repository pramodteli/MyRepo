package com.dtcc.config;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class PersistanceConfiguartion {

	@ConfigurationProperties("spring.datasource")
	@Bean
	@Primary
	public DataSource getDataSource(){
		
		return DataSourceBuilder.create().build();
	}
}
