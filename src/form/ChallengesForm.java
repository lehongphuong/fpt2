package form;

import java.util.ArrayList;

import model.bean.Categories;
import model.bean.Editorial;
import model.bean.LeaderBoard;
import model.bean.Problem;
import model.bean.Status;
import model.bean.Subject;
import model.bean.Submit;
import model.bean.User;

import org.apache.struts.action.ActionForm;

public class ChallengesForm extends ActionForm {
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
	private String statusLogin;
	private String rank;
	// subject
	private String subId;
	private String title;
	private String successRate;
	private String maxScore;
	private String difficutly;
	// problem
	private int proId;
	private String description;
	private String constrain;
	private String inputRequire;
	private String outputRequire;
	private String inputTestCase;
	private String outputTestCase;
	private String explain;
	private String inputUser;

	// problem
	private Problem problem;

	// submit
	private ArrayList<Submit> submitList;
	private ArrayList<Submit> submitListLead;

	// leaderbord
	private ArrayList<LeaderBoard> leaderList;
	// editorial
	private Editorial editorial;

	// khai bao cac bien moi
	private String editor;
	private String codeSample;
	private String run;
	private String yourOutput;
	private String error;

	private String runCode;
	private String submit;

	private String numberTestCase;
	private String testCasePass;
	private String result;
	private Subject subject;

	private ArrayList<User> userList;

	/**
	 * @return the submitListLead
	 */
	public ArrayList<Submit> getSubmitListLead() {
		return submitListLead;
	}

	/**
	 * @param submitListLead
	 *            the submitListLead to set
	 */
	public void setSubmitListLead(ArrayList<Submit> submitListLead) {
		this.submitListLead = submitListLead;
	}

	/**
	 * @return the userList
	 */
	public ArrayList<User> getUserList() {
		return userList;
	}

	/**
	 * @param userList
	 *            the userList to set
	 */
	public void setUserList(ArrayList<User> userList) {
		this.userList = userList;
	}

	/**
	 * @return the subject
	 */
	public Subject getSubject() {
		return subject;
	}

	/**
	 * @param subject
	 *            the subject to set
	 */
	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	/**
	 * @return the numberTestCase
	 */
	public String getNumberTestCase() {
		return numberTestCase;
	}

	/**
	 * @param numberTestCase
	 *            the numberTestCase to set
	 */
	public void setNumberTestCase(String numberTestCase) {
		this.numberTestCase = numberTestCase;
	}

	/**
	 * @return the testCasePass
	 */
	public String getTestCasePass() {
		return testCasePass;
	}

	/**
	 * @param testCasePass
	 *            the testCasePass to set
	 */
	public void setTestCasePass(String testCasePass) {
		this.testCasePass = testCasePass;
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

	/**
	 * @return the runCode
	 */
	public String getRunCode() {
		return runCode;
	}

	/**
	 * @param runCode
	 *            the runCode to set
	 */
	public void setRunCode(String runCode) {
		this.runCode = runCode;
	}

	/**
	 * @return the submit
	 */
	public String getSubmit() {
		return submit;
	}

	/**
	 * @param submit
	 *            the submit to set
	 */
	public void setSubmit(String submit) {
		this.submit = submit;
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
	 * @return the yourOutput
	 */
	public String getYourOutput() {
		return yourOutput;
	}

	/**
	 * @param yourOutput
	 *            the yourOutput to set
	 */
	public void setYourOutput(String yourOutput) {
		this.yourOutput = yourOutput;
	}

	/**
	 * @return the error
	 */
	public String getError() {
		return error;
	}

	/**
	 * @param error
	 *            the error to set
	 */
	public void setError(String error) {
		this.error = error;
	}

	/**
	 * @return the codeSample
	 */
	public String getCodeSample() {
		return codeSample;
	}

	/**
	 * @param codeSample
	 *            the codeSample to set
	 */
	public void setCodeSample(String codeSample) {
		this.codeSample = codeSample;
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
	 * @return the subId
	 */
	public String getSubId() {
		return subId;
	}

	/**
	 * @param subId
	 *            the subId to set
	 */
	public void setSubId(String subId) {
		this.subId = subId;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title
	 *            the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the successRate
	 */
	public String getSuccessRate() {
		return successRate;
	}

	/**
	 * @param successRate
	 *            the successRate to set
	 */
	public void setSuccessRate(String successRate) {
		this.successRate = successRate;
	}

	/**
	 * @return the maxScore
	 */
	public String getMaxScore() {
		return maxScore;
	}

	/**
	 * @param maxScore
	 *            the maxScore to set
	 */
	public void setMaxScore(String maxScore) {
		this.maxScore = maxScore;
	}

	/**
	 * @return the difficutly
	 */
	public String getDifficutly() {
		return difficutly;
	}

	/**
	 * @param difficutly
	 *            the difficutly to set
	 */
	public void setDifficutly(String difficutly) {
		this.difficutly = difficutly;
	}

	/**
	 * @return the proId
	 */
	public int getProId() {
		return proId;
	}

	/**
	 * @param proId
	 *            the proId to set
	 */
	public void setProId(int proId) {
		this.proId = proId;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the constrain
	 */
	public String getConstrain() {
		return constrain;
	}

	/**
	 * @param constrain
	 *            the constrain to set
	 */
	public void setConstrain(String constrain) {
		this.constrain = constrain;
	}

	/**
	 * @return the inputRequire
	 */
	public String getInputRequire() {
		return inputRequire;
	}

	/**
	 * @param inputRequire
	 *            the inputRequire to set
	 */
	public void setInputRequire(String inputRequire) {
		this.inputRequire = inputRequire;
	}

	/**
	 * @return the outputRequire
	 */
	public String getOutputRequire() {
		return outputRequire;
	}

	/**
	 * @param outputRequire
	 *            the outputRequire to set
	 */
	public void setOutputRequire(String outputRequire) {
		this.outputRequire = outputRequire;
	}

	/**
	 * @return the inputTestCase
	 */
	public String getInputTestCase() {
		return inputTestCase;
	}

	/**
	 * @param inputTestCase
	 *            the inputTestCase to set
	 */
	public void setInputTestCase(String inputTestCase) {
		this.inputTestCase = inputTestCase;
	}

	/**
	 * @return the outputTestCase
	 */
	public String getOutputTestCase() {
		return outputTestCase;
	}

	/**
	 * @param outputTestCase
	 *            the outputTestCase to set
	 */
	public void setOutputTestCase(String outputTestCase) {
		this.outputTestCase = outputTestCase;
	}

	/**
	 * @return the explain
	 */
	public String getExplain() {
		return explain;
	}

	/**
	 * @param explain
	 *            the explain to set
	 */
	public void setExplain(String explain) {
		this.explain = explain;
	}

	/**
	 * @return the inputUser
	 */
	public String getInputUser() {
		return inputUser;
	}

	/**
	 * @param inputUser
	 *            the inputUser to set
	 */
	public void setInputUser(String inputUser) {
		this.inputUser = inputUser;
	}

	/**
	 * @return the problem
	 */
	public Problem getProblem() {
		return problem;
	}

	/**
	 * @param problem
	 *            the problem to set
	 */
	public void setProblem(Problem problem) {
		this.problem = problem;
	}

	/**
	 * @return the submitList
	 */
	public ArrayList<Submit> getSubmitList() {
		return submitList;
	}

	/**
	 * @param submitList
	 *            the submitList to set
	 */
	public void setSubmitList(ArrayList<Submit> submitList) {
		this.submitList = submitList;
	}

	/**
	 * @return the leaderList
	 */
	public ArrayList<LeaderBoard> getLeaderList() {
		return leaderList;
	}

	/**
	 * @param leaderList
	 *            the leaderList to set
	 */
	public void setLeaderList(ArrayList<LeaderBoard> leaderList) {
		this.leaderList = leaderList;
	}

	/**
	 * @return the editorial
	 */
	public Editorial getEditorial() {
		return editorial;
	}

	/**
	 * @param editorial
	 *            the editorial to set
	 */
	public void setEditorial(Editorial editorial) {
		this.editorial = editorial;
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

}