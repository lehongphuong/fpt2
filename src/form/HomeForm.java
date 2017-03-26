package form;

import java.util.ArrayList;

import model.bean.Categories;
import model.bean.Menu;

import org.apache.struts.action.ActionForm;

public class HomeForm extends ActionForm {
	private String userId;
	private String username;
	private String password;
	private String avatar;
	private String university;
	private String point;
	private String typeUser;

	private ArrayList<Menu> menuList;
	private ArrayList<Categories> cateList;

	private String statusLogin;

	public String getStatusLogin() {
		return statusLogin;
	}

	public void setStatusLogin(String statusLogin) {
		this.statusLogin = statusLogin;
	}

	public ArrayList<Menu> getMenuList() {
		return menuList;
	}

	public void setMenuList(ArrayList<Menu> menuList) {
		this.menuList = menuList;
	}

	public ArrayList<Categories> getCateList() {
		return cateList;
	}

	public void setCateList(ArrayList<Categories> cateList) {
		this.cateList = cateList;
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

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPoint() {
		return point;
	}

	public void setPoint(String point) {
		this.point = point;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public String getTypeUser() {
		return typeUser;
	}

	public void setTypeUser(String typeUser) {
		this.typeUser = typeUser;
	}

}
