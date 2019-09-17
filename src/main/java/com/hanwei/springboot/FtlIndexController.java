package com.hanwei.springboot;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dd")
public class FtlIndexController {

	@RequestMapping("/ftlIndex")
	public String ftpIndex(Map<String, Object> map) {
		map.put("name", "zhangsan");
		map.put("age", 22);
		map.put("sex", "0");
		return "ftlIndex";
	}
	
	@RequestMapping("/getIndex")
	public String jspIndex() {
		return "index";
	}
}
