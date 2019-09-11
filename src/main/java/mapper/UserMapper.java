package mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Qualifier;

import com.hanwei.entity.User;

public interface UserMapper {
	//查询语句
	@Select("select * from users where username=#{name}")
	User findByName(@Param("name") String name);
	
	//插入语句
	
	@Insert("Insert into user (name,age) values (@{name},@{age})")
	int insert(@Param("name") String name,@Param("age") int age);
}
