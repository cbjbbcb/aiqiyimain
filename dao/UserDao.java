package dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import entity.User;

@Repository
public interface UserDao {
	/*
	 * 用户注册
	 * 
	 */
	public Integer register(@Param("uname")String uname, @Param("password")String password,@Param("nickName") String nickName);

	/*
	 * 得出所有用户名，用于避免注册重复
	 */
	public List<String> showUnames();

	/*
	 * 用户登陆,根据用户名查用户
	 * 
	 */
	public User getUserByUname(String uname);


}
