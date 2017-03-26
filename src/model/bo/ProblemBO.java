package model.bo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.bean.Problem;
import model.dao.ProblemDAO;

public class ProblemBO {
	ProblemDAO dao = new ProblemDAO();

	/*
	 * get all categories
	 */
	public ArrayList<Problem> getAllProblem() {
		return dao.getAllProblem();
	}
	
	/*
	 * get problem by subid
	 */
	public Problem getProblemBySubId(String subId) {
		return dao.getProblemBySubId(subId);
	}

	public void insertProblem(Problem Problem) {
		dao.insertProblem(Problem);

	}

	// update
	public void updateProblem(Problem Problem) {
		dao.updateProblem(Problem);
	}

	// delete
	public void deleteProblem(int proId) {
		dao.deleteProblem(proId);
	}
	
	

}
