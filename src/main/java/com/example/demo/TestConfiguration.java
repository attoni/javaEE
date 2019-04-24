package com.example.demo;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfiguration {
@Autowired
public TestProperties prop;

@PostConstruct
private void init(){
	System.out.println(prop.isVisibleEveryThings());
}
}