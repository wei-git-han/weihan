package Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import service.UserService;

@RestController
public class userController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/insert")
	private int insert(String name,int age) {
		return userService.insert(name, age);
	}
}
