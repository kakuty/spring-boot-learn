package com.learn.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.learn.examplebean.FakeDataSource;
import com.learn.examplebean.FakeUcBroker;

@Configuration

public class PropertyConfig {

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
		fakeDataSource.setUsername(username);
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
}
