package net.neo.sample.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@ComponentScan
@RestController
public class SampleController  {

	@RequestMapping("/sample")
	public String home() {

		return "Hello World!";

	}

}