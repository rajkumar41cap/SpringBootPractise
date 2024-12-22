package com.ait.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ait.component.DataSource;

@Configuration
public class DataSourceConfig {
	@Bean
	public DataSource data() {
		return new DataSource();
	}
}
