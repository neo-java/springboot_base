package net.neo.sample.spring.boot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

import net.neo.sample.controller.SampleController;
import net.neo.sample.user.controller.UserController;

@Configuration
@EnableAutoConfiguration
@ComponentScan
@SpringBootApplication
@EnableScheduling
@MapperScan("net.neo.sample")

@ComponentScan(basePackageClasses=SampleController.class)
@ComponentScan(basePackageClasses=UserController.class)
public class Application {
	
	
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }
}
