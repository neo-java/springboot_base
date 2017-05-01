package com.example.project;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import java.io.IOException;

@SpringBootApplication
@MapperScan(basePackages = "com.example.project.mapper")
public class Application {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);
	}

	public static final String TYPE_ALIASES_PACKAGE = "com.example.project.domain";
//	public static final String CONFIG_LOCATION_PATH = "classpath:mybatis-config.xml";
	public static final String MAPPER_LOCATIONS_PATH = "classpath:mapper/**/*.xml";

	@Bean
	public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
		PathMatchingResourcePatternResolver pathResolver = new PathMatchingResourcePatternResolver();

		SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
		factoryBean.setDataSource(dataSource);
		factoryBean.setMapperLocations(pathResolver.getResources("classpath:mapper/**/*.xml"));

		SqlSessionFactory sessionFactory = factoryBean.getObject();

		return sessionFactory;
	}

}
