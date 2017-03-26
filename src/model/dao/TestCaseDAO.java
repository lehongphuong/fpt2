package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.bean.TestCase;

public class TestCaseDAO {
	Connection con = null;

	public TestCaseDAO() {
		super();
		this.con = DBConnect.getConnect();
	}

	/*
	 * get all TestCase
	 */
	public ArrayList<TestCase> getAllTestCase() {
		ArrayList<TestCase> list = new ArrayList<>();
		String sql = "select * from TestCase";
		try {

			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				TestCase l = new TestCase();
				l.setTestId(rs.getInt(1));
				l.setSubId(rs.getInt(2));
				l.setInput(rs.getString(3));
				l.setOutput(rs.getString(4));
				l.setTimeAsk(rs.getFloat(5));

				list.add(l);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}

	
	/*
	 * get all TestCase by subject id
	 */
	public ArrayList<TestCase> getAllTestCaseBySubjectId(String subId) {
		ArrayList<TestCase> list = new ArrayList<>();
		String sql = "select * from TestCase where subId="+subId;
		try {

			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				TestCase l = new TestCase();
				l.setTestId(rs.getInt(1));
				l.setSubId(rs.getInt(2));
				l.setInput(rs.getString(3));
				l.setOutput(rs.getString(4));
				l.setTimeAsk(rs.getFloat(5));

				list.add(l);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}

	
	public void insertTestCase(TestCase testCase) {
		String sql = "insert into TestCase values(?,?,?,?)";
		try {
			PreparedStatement pr = con.prepareStatement(sql);
			pr.setInt(1, testCase.getSubId());
			pr.setString(2, testCase.getInput());
			pr.setString(3, testCase.getOutput());
			pr.setFloat(4, testCase.getTimeAsk());

			pr.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// update
	public void updateTestCase(TestCase testCase) {
		String sql = "update TestCase set subId=?,input=?, output=?, timeAsk=? where testId=?";
		try {
			PreparedStatement pr = con.prepareStatement(sql);

			pr.setInt(1, testCase.getSubId());
			pr.setString(2, testCase.getInput());
			pr.setString(3, testCase.getOutput());
			pr.setFloat(4, testCase.getTimeAsk());
			pr.setInt(5, testCase.getTestId());

			pr.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// delete
	public void deleteTestCase(int testId) {
		String sql = "delete from TestCase where testId='" + testId + "'";
		try {
			Statement st = con.createStatement();
			st.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
