package com.example.demo;
/*
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.support.DefaultConversionService;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.boot.builder.SpringApplicationBuilder;

@Configuration
@EnableAutoConfiguration
@EnableScheduling
@SpringBootApplication
@ComponentScan(basePackages = "com.example.demo")

@EnableTransactionManagement
@Transactional(propagation = Propagation.REQUIRED)
public class FirstApiApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(FirstApiApplication.class, args);
	}
	

	@Override
	protected final SpringApplicationBuilder configure(final SpringApplicationBuilder application) {
		return application.sources(FirstApiApplication.class);
	}

	@Bean
	public ConversionService conversionService() {
		return new DefaultConversionService();
	}
	
}*/
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
//import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//import com.amazonaws.services.elasticmapreduce.model.Application;

@Configuration
@EnableAutoConfiguration
@ComponentScan
public class FirstApiApplication extends SpringBootServletInitializer {

    public static void main(final String[] args) {
        SpringApplication.run(FirstApiApplication.class, args);
    }

    /*@Override
    protected final SpringApplicationBuilder configure(final SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }*/
}


