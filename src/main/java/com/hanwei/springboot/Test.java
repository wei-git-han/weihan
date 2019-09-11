package com.hanwei.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@EnableAutoConfiguration  //自动配置
//@ComponentScan("com.hanwei.springboot") //规定扫包范围

public class Test {

	public static void main(String[] args) {
		SpringApplication.run(Test.class, args);

	}

}
