package com.gaurav.onlyAnnotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:myAnnotation.properties")
public class ComponentJdbcConnection {
	
	@Autowired
    Environment env;
	
	@Value("${url}")
	private String url;
	
	@Value("${prop.id}")
	private String id;
	
	@Value("${password}")
	private String password;
	
	public ComponentJdbcConnection() {
		System.out.println("JDBC Connection : " + url +
				", " + id + ", "+ password + " : ");
	}
	
	@PostConstruct
	public void postConstruct() {
		System.out.println("postConstruct");
	}

	@PreDestroy
	public void preDestroy() {
		System.out.println("preDestroy");
	}
}
