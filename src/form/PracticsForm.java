package form;

import java.util.ArrayList;

import model.bean.Categories;
import model.bean.Status;
import model.bean.Subject;
import model.bean.Tutorial;

import org.apache.struts.action.ActionForm;

public class PracticsForm extends ActionForm {

	private String cateId;
	private String menuId;
	private String name; // name of categorie
	private ArrayList<Categories> cateList;
	private ArrayList<Subject> subList;
	private ArrayList<Subject> subListTemp;
	private ArrayList<Status> statusList;
	private String userId;
	private String username;
	private String password;
	private String avatar;
	private String university;
	private String point;
	private String typeUser;
	private String statusLogin;
	private String rank;

	public ArrayList<Subject> getSubListTemp() {
		return subListTemp;
	}

	public void setSubListTemp(ArrayList<Subject> subListTemp) {
		this.subListTemp = subListTemp;
	}

	public ArrayList<Status> getStatusList() {
		return statusList;
	}

	public void setStatusList(ArrayList<Status> statusList) {
		this.statusList = statusList;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public String getStatusLogin() {
		return statusLogin;
	}

	public void setStatusLogin(String statusLogin) {
		this.statusLogin = statusLogin;
	}

	public String getCateId() {
		return cateId;
	}

	public void setCateId(String cateId) {
		this.cateId = cateId;
	}

	public String getMenuId() {
		return menuId;
	}

	public void setMenuId(String menuId) {
		this.menuId = menuId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Categories> getCateList() {
		return cateList;
	}

	public void setCateList(ArrayList<Categories> cateList) {
		this.cateList = cateList;
	}

	public ArrayList<Subject> getSubList() {
		return subList;
	}

	public void setSubList(ArrayList<Subject> subList) {
		this.subList = subList;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
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

	public String getPoint() {
		return point;
	}

	public void setPoint(String point) {
		this.point = point;
	}

	public String getTypeUser() {
		return typeUser;
	}

	public void setTypeUser(String typeUser) {
		this.typeUser = typeUser;
	}

}
