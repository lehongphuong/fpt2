package model.bean;

public class User {
	private int userId;
	private String username;
	private String password;
	private String avatar;
	private String university;
	private float point;
	private String typeUser;
	
	 
	public User() {
		super();
	}
	public User(int userId, String username, String password, String avatar,
			String university, float point, String typeUser) {
		super();
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.avatar = avatar;
		this.university = university;
		this.point = point;
		this.typeUser = typeUser;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
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
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	public String getUniversity() {
		return university;
	}
	public void setUniversity(String university) {
		this.university = university;
	}
	public float getPoint() {
		return point;
	}
	public void setPoint(float point) {
		this.point = point;
	}
	public String getTypeUser() {
		return typeUser;
	}
	public void setTypeUser(String typeUser) {
		this.typeUser = typeUser;
	}
	
	

}
