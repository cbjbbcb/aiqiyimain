package dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import entity.User;

@Repository
public interface UserDao {
	/*
	 * �û�ע��
	 * 
	 */
	public Integer register(@Param("uname")String uname, @Param("password")String password,@Param("nickName") String nickName);

	/*
	 * �ó������û��������ڱ���ע���ظ�
	 */
	public List<String> showUnames();

	/*
	 * �û���½,�����û������û�
	 * 
	 */
	public User getUserByUname(String uname);


}
