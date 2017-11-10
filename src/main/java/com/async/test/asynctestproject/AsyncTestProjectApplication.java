package com.async.test.asynctestproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//import com.async.test.asynctestproject.filter.CORSFilter;

@SpringBootApplication
@EnableJpaRepositories({"com.async.test.asynctestproject"})
public class AsyncTestProjectApplication extends SpringBootServletInitializer{

	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(AsyncTestProjectApplication.class);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(AsyncTestProjectApplication.class, args);
	}
	
	/*@Bean
	public FilterRegistrationBean crosFilterRegistration(){
	
		FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(new CORSFilter());
		filterRegistrationBean.setName("CROS Filter");
		filterRegistrationBean.addUrlPatterns("/*");
		filterRegistrationBean.setOrder(1);
		return filterRegistrationBean;
	}*/
}
