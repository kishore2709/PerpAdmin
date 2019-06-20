package com.springapp;

import java.util.TimeZone;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

//@EnableSwagger2
@SpringBootApplication
//@SpringBootApplication(scanBasePackages={"com.confidential","com.springapp.modules.system.service"})
@EntityScan(basePackageClasses = { 
		RunApplication.class,
		Jsr310JpaConverters.class 
})
public class RunApplication extends SpringBootServletInitializer{

	@PostConstruct
	void init() {
		TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
	}

	public static void main(String[] args) {
		SpringApplication.run(RunApplication.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		// TODO Auto-generated method stub
		return builder.sources(RunApplication.class);
	}
}
