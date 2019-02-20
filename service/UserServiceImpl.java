package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import util.MD5Encrypter;

import dao.UserDao;

import entity.User;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	/*
	 * 用户注册
	 */
	public Integer register(String uname, String password, String nickName) {
		return userDao.register(uname, password, nickName);
	}

	/*
	 * 得出所有用户名，用于避免注册重复
	 */
	public List<String> showUnames() {
		return userDao.showUnames();
	}

	/*
	 * 用户登陆
	 */
	public User login(String uname, String password) {
		User user = userDao.getUserByUname(uname);
//		System.out.println(MD5Encrypter.encrypt(password));
		if ((user.getPassword()).equals(MD5Encrypter.encrypt(password))) {
			return user;
		} else {
			System.out.println("密码错误");
			return null;
		}
	}

}
