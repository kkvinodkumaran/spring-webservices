package com.vinod.test.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy; 
@Configuration
@ComponentScan("com.vinod.test.aop")
@EnableAspectJAutoProxy
public class MySpringAOPConifg {
	
}
