package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.extern.slf4j.Slf4j;
import mapper.UserMapper;

@Service
@Slf4j
public class UserService {
	@Autowired
	private UserMapper userMapper;

	//事务回滚
	@Transactional
	public int insert(String name,int age) {
		int result  = userMapper.insert(name, age);
		log.info("dddddd");
		return result;
	}
}
