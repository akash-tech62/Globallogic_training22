package com.EMPL.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.EMPL.DAO.EmplDao;
import com.EMPL.DAO.EmplDaoI;
import com.EMPL.config.*;


@Configuration
@EnableWebMvc
@ComponentScan(basePackages="com.EMPL")
public class SpringConfig implements WebMvcConfigurer {
	
	@Bean
	public DataSource getDataSource() {
		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/EMPLOYEE");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		
		return dataSource;
	}

	@Bean
	public ViewResolver getViewResolver() {
		InternalResourceViewResolver resolver=new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		
		return resolver;
	}
	
	@Bean
	public EmplDao getContactDAO() {
		return new EmplDaoI(getDataSource());
	}
}