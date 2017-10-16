package com.learn.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

import com.learn.examplebean.FakeDataSource;
import com.learn.examplebean.FakeUcBroker;

@Configuration
@PropertySources({
	@PropertySource("classpath:datasource.properties"),
	@PropertySource("classpath:ucbroker.properties")
})
public class PropertyConfig {
	@Autowired
	Environment env;

	@Value("${learner.username}")
	private String username;

	@Value("${learner.password}")
	private String password;

	@Value("${learner.dburl}")
	private String dburl;

	@Value("${learner.uc.username}")
	private String ucUsername;
	
	@Value("${learner.uc.password}")
	private String ucPassword;
	
	@Value("${learner.uc.dburl}")
	private String ucUrl;
	
	@Bean
	public FakeDataSource fakeDataSource() {
		FakeDataSource fakeDataSource = new FakeDataSource();
		fakeDataSource.setUsername(env.getProperty("USERNAME"));
		fakeDataSource.setPassword(password);
		fakeDataSource.setUrl(dburl);
		return fakeDataSource;
	}

	@Bean
	public FakeUcBroker fakeUcBroker() {
		FakeUcBroker fakeUcBroker = new FakeUcBroker();
		fakeUcBroker.setPassword(ucPassword);
		fakeUcBroker.setUrl(ucUrl);
		fakeUcBroker.setUsername(ucUsername);
		return fakeUcBroker;
	}

	@Bean
	public static PropertySourcesPlaceholderConfigurer properties() {
		PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
		return propertySourcesPlaceholderConfigurer;
	}

}
