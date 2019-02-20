package service;

import java.util.List;

import entity.User;


public interface UserService {
	/*
	 * 用户注册
	 * 
	 */
	public Integer register(String uname, String password, String nickName);

	/*
	 * 得出所有用户名，用于避免注册重复
	 */
	public List<String> showUnames();

	/*
	 * 用户登陆
	 * 
	 */
	public User login(String uname, String password);


}
