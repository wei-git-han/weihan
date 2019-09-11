package com.hanwei.springboot;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;


@RestController
//@EnableAutoConfiguration 作用开启自动装备，不是扫包
@ControllerAdvice("com.hanwei.springboot")
@Slf4j
public class TestSpringboot {
	//private static final Logger Logger = LoggerFactory.getLogger(TestSpringboot.class);
	@RequestMapping("/index")
	public String getIndex() {
		log.info("ddddddddddddd");
		return "hello world";
	}
	
	@RequestMapping("/getMap")
	public Map mapGetmember() {
		Map map = new HashMap();
		map.put("name", "zhangsan");
		map.put("age",22);
		return map;
	}
	@RequestMapping("/getException")
	public String tt( int  j) {
		int i = 1/j;
		return "success" + i;
	}
	
	@ResponseBody
	@ExceptionHandler(RuntimeException.class)
	public Map<String, Object> errerMap(){
		Map<String, Object> mepResultMap = new HashMap<String, Object>();
		mepResultMap.put("errorCode", 500);
		mepResultMap.put("message", "系统异常！");
		return mepResultMap;
	}
	
	
	
	
}
