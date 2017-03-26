package model.bo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.bean.Submit;
import model.dao.SubmitDAO;

public class SubmitBO {
	SubmitDAO dao = new SubmitDAO();

	/*
	 * get all categories
	 */
	public ArrayList<Submit> getAllSubmit() {
		return dao.getAllSubmit();
	}
	
	/*
	 * get all submit leader
	 */
	public ArrayList<Submit> getAllSubmitLead(String subId) {
		return dao.getAllSubmitLead(subId);
	}

	/*
	 * get all sumit by user id and subject id
	 */
	public ArrayList<Submit> getAllSubmitOfUserWithSubId(String userId,
			String subId) {
		return dao.getAllSubmitOfUserWithSubId(userId, subId);
	}

	public int insertSubmit(Submit submit) {
		return dao.insertSubmit(submit);

	}

	// update
	public void updateSubmit(Submit submit) {
		dao.updateSubmit(submit);
	}

	// delete
	public void deleteSubmit(int SubmitId) {
		dao.deleteSubmit(SubmitId);
	}

}
