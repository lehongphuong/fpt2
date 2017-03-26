package form;

import java.util.ArrayList;

import model.bean.Categories;
import model.bean.Tutorial;
import model.bean.TutorialCode;

import org.apache.struts.action.ActionForm;

public class TutorialsForm extends ActionForm {

	private String cateId;
	private String menuId;
	private String name; // name of categorie
	private ArrayList<Categories> cateList;

	private String userId;
	private String username;
	private String password;
	private String avatar;
	private String university;
	private String point;
	private String typeUser;

	public TutorialCode getTutCode() {
		return tutCode;
	}

	public void setTutCode(TutorialCode tutCode) {
		this.tutCode = tutCode;
	}

	private String statusLogin;
	private String rank;
	// tutorial
	private ArrayList<Tutorial> tutList;
	private ArrayList<Tutorial> tutListTemp;
	private ArrayList<TutorialCode> tutCodeList;

	private TutorialCode tutCode;

	private String editor;

	private String code;

	private String result;
	private String run = "true";
	private String firstTutId;

	
	
	public ArrayList<Tutorial> getTutListTemp() {
		return tutListTemp;
	}

	public void setTutListTemp(ArrayList<Tutorial> tutListTemp) {
		this.tutListTemp = tutListTemp;
	}

	/**
	 * @return the firstTutId
	 */
	public String getFirstTutId() {
		return firstTutId;
	}

	/**
	 * @param firstTutId
	 *            the firstTutId to set
	 */
	public void setFirstTutId(String firstTutId) {
		this.firstTutId = firstTutId;
	}

	/**
	 * @return the run
	 */
	public String getRun() {
		return run;
	}

	/**
	 * @param run
	 *            the run to set
	 */
	public void setRun(String run) {
		this.run = run;
	}

	/**
	 * @return the cateId
	 */
	public String getCateId() {
		return cateId;
	}

	/**
	 * @param cateId
	 *            the cateId to set
	 */
	public void setCateId(String cateId) {
		this.cateId = cateId;
	}

	/**
	 * @return the menuId
	 */
	public String getMenuId() {
		return menuId;
	}

	/**
	 * @param menuId
	 *            the menuId to set
	 */
	public void setMenuId(String menuId) {
		this.menuId = menuId;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the cateList
	 */
	public ArrayList<Categories> getCateList() {
		return cateList;
	}

	/**
	 * @param cateList
	 *            the cateList to set
	 */
	public void setCateList(ArrayList<Categories> cateList) {
		this.cateList = cateList;
	}

	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @param userId
	 *            the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username
	 *            the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the avatar
	 */
	public String getAvatar() {
		return avatar;
	}

	/**
	 * @param avatar
	 *            the avatar to set
	 */
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	/**
	 * @return the university
	 */
	public String getUniversity() {
		return university;
	}

	/**
	 * @param university
	 *            the university to set
	 */
	public void setUniversity(String university) {
		this.university = university;
	}

	/**
	 * @return the point
	 */
	public String getPoint() {
		return point;
	}

	/**
	 * @param point
	 *            the point to set
	 */
	public void setPoint(String point) {
		this.point = point;
	}

	/**
	 * @return the typeUser
	 */
	public String getTypeUser() {
		return typeUser;
	}

	/**
	 * @param typeUser
	 *            the typeUser to set
	 */
	public void setTypeUser(String typeUser) {
		this.typeUser = typeUser;
	}

	/**
	 * @return the statusLogin
	 */
	public String getStatusLogin() {
		return statusLogin;
	}

	/**
	 * @param statusLogin
	 *            the statusLogin to set
	 */
	public void setStatusLogin(String statusLogin) {
		this.statusLogin = statusLogin;
	}

	/**
	 * @return the rank
	 */
	public String getRank() {
		return rank;
	}

	/**
	 * @param rank
	 *            the rank to set
	 */
	public void setRank(String rank) {
		this.rank = rank;
	}

	/**
	 * @return the tutList
	 */
	public ArrayList<Tutorial> getTutList() {
		return tutList;
	}

	/**
	 * @param tutList
	 *            the tutList to set
	 */
	public void setTutList(ArrayList<Tutorial> tutList) {
		this.tutList = tutList;
	}

	/**
	 * @return the tutCodeList
	 */
	public ArrayList<TutorialCode> getTutCodeList() {
		return tutCodeList;
	}

	/**
	 * @param tutCodeList
	 *            the tutCodeList to set
	 */
	public void setTutCodeList(ArrayList<TutorialCode> tutCodeList) {
		this.tutCodeList = tutCodeList;
	}

	/**
	 * @return the editor
	 */
	public String getEditor() {
		return editor;
	}

	/**
	 * @param editor
	 *            the editor to set
	 */
	public void setEditor(String editor) {
		this.editor = editor;
	}

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code
	 *            the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * @return the result
	 */
	public String getResult() {
		return result;
	}

	/**
	 * @param result
	 *            the result to set
	 */
	public void setResult(String result) {
		this.result = result;
	}

}