package model.bo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.bean.Tutorial;
import model.dao.TutorialDAO;

public class TutorialBO {

	TutorialDAO dao = new TutorialDAO();

	/*
	 * get all Tutorial
	 */
	public ArrayList<Tutorial> getAllTutorial() {
		return dao.getAllTutorial();

	}

	

	/*
	 *get all Tutorial by cate id
	 */
	public ArrayList<Tutorial> getAllTutorialByCateId(String cateId) {
		return dao.getAllTutorialByCateId(cateId);
	}

	
	public void insertTutorial(Tutorial tutorial) {
		dao.insertTutorial(tutorial);

	}

	// update
	public void updateTutorial(Tutorial tutorial) {
		dao.updateTutorial(tutorial);
	}

	// delete
	public void deleteTutorial(int tuId) {
		dao.deleteTutorial(tuId);
	}

}
