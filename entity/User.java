package entity;


public class User {
	
	private Integer uid;
	private String uname;
	private String password;
	private String nickName;
	public Integer getUid(){
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	@Override
	public String toString() {
		return "User [nickName=" + nickName + ", password=" + password
				+ ", uid=" + uid + ", uname=" + uname + "]";
	}
	
}
