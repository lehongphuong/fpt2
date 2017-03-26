package model.bo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.bean.TestCase;
import model.dao.TestCaseDAO;

public class TestCaseBO {
	TestCaseDAO dao=new TestCaseDAO();
	/*
	 * get all TestCase
	 */
	public ArrayList<TestCase> getAllTestCase() {
		return dao.getAllTestCase();
	}
	
	/*
	 * get all TestCase by subject id
	 */
	public ArrayList<TestCase> getAllTestCaseBySubjectId(String subId) {
		return dao.getAllTestCaseBySubjectId(subId);
	}

	public void insertTestCase(TestCase testCase) {
		dao.insertTestCase(testCase);

	}

	// update
	public void updateTestCase(TestCase testCase) {
		dao.updateTestCase(testCase);
	}

	// delete
	public void deleteTestCase(int testId) {
		dao.deleteTestCase(testId);
	}

}
