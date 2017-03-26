package model.bo;

import java.util.ArrayList;

import model.bean.Subject;
import model.dao.SubjectDAO;

public class SubjectBO {
	SubjectDAO dao = new SubjectDAO();

	/*
	 * get all categories
	 */
	public ArrayList<Subject> getAllSubject() {
		return dao.getAllSubject();
	}

	/*
	 * get all subject by cate id
	 */
	public ArrayList<Subject> getAllSubjectByCateId(String cateId) {
		return dao.getAllSubjectByCateId(cateId);
	}
	
	/*
	 * get one subject by subId
	 */
	public Subject getOneSubjectBySubId(String subId) {
		return dao.getOneSubjectBySubId(subId);
	}

	public void insertSubject(Subject Subject) {
		dao.insertSubject(Subject);

	}

	// update
	public void updateSubject(Subject Subject) {
		dao.updateSubject(Subject);
	}

	// delete
	public void deleteSubject(int subId) {
		dao.deleteSubject(subId);
	}
}