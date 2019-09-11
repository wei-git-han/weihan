package com.hanwei.springboot;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Setter
@Getter
@Slf4j
public class User {
	private String name;
	private int age;
	
	@Override
	public String toString() {
		return "name"+name+"age"+age;
	}
	
	public static void main(String[] args) {
		User user = new User();
		user.setName("han");
		user.setAge(22);
		log.info("dddd");
		
	}

}
