package service;

import java.util.List;

import entity.User;


public interface UserService {
	/*
	 * �û�ע��
	 * 
	 */
	public Integer register(String uname, String password, String nickName);

	/*
	 * �ó������û��������ڱ���ע���ظ�
	 */
	public List<String> showUnames();

	/*
	 * �û���½
	 * 
	 */
	public User login(String uname, String password);


}
