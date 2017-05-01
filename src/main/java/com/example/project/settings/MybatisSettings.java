package com.example.project.settings;

import org.springframework.context.annotation.Configuration;

@Configuration
public class MybatisSettings {

//	@Bean
//	public DataSource dataSource() {
//		return DataSourceBuilder.create().build();
//	}
//
//	@Bean
//	public SqlSessionFactory sqlSessionFactory(DataSource dataSource, ApplicationContext applicationContext)
//			throws Exception {
//		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
//		sqlSessionFactoryBean.setDataSource(dataSource);
//		sqlSessionFactoryBean.setMapperLocations(applicationContext.getResources("classpath:mapper/*.xml"));
//		return sqlSessionFactoryBean.getObject();
//	}
//
//	@Bean
//	public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory) throws Exception {
//		return new SqlSessionTemplate(sqlSessionFactory);
//	}
//
//	@Bean
//	public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
//		final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
//		sessionFactory.setDataSource(dataSource);
//		return sessionFactory.getObject();
//	}
}
