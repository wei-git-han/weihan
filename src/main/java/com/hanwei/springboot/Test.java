package com.hanwei.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@EnableAutoConfiguration  //�Զ�����
//@ComponentScan("com.hanwei.springboot") //�涨ɨ����Χ

public class Test {

	public static void main(String[] args) {
		SpringApplication.run(Test.class, args);

	}

}
