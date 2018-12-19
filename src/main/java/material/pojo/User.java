package material.pojo;

public class User extends BaseEntity{
	
	/***
	 *  USER_ID              varchar(40) not null,
   DEPT_ID              varchar(40),
   USERNAME             varchar(50),
   PASSWORD             varchar(20),
   STATE                int comment '1启用0停用',
	 */
	private String userId;
	private Dept dept;
	private String username;
	private String password;
	private Integer state;
	private UserInfo userInfo;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public Dept getDept() {
		return dept;
	}
	public void setDept(Dept dept) {
		this.dept = dept;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public UserInfo getUserInfo() {
		return userInfo;
	}
	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

	
}
