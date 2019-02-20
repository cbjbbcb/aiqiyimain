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
	 * �û�ע��
	 */
	public Integer register(String uname, String password, String nickName) {
		return userDao.register(uname, password, nickName);
	}

	/*
	 * �ó������û��������ڱ���ע���ظ�
	 */
	public List<String> showUnames() {
		return userDao.showUnames();
	}

	/*
	 * �û���½
	 */
	public User login(String uname, String password) {
		User user = userDao.getUserByUname(uname);
//		System.out.println(MD5Encrypter.encrypt(password));
		if ((user.getPassword()).equals(MD5Encrypter.encrypt(password))) {
			return user;
		} else {
			System.out.println("�������");
			return null;
		}
	}

}
