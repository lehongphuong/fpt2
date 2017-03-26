package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.bean.Problem;

public class ProblemDAO {
	Connection con = null;

	public ProblemDAO() {
		super();
		this.con = DBConnect.getConnect();
	}

	/*
	 * get all categories
	 */
	public ArrayList<Problem> getAllProblem() {
		ArrayList<Problem> list = new ArrayList<>();
		String sql = "select * from Problem";
		try {

			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				Problem l = new Problem();
				l.setProId(rs.getInt(1));
				l.setSubId(rs.getInt(2));
				l.setDescription(rs.getString(3));
				l.setConstrain(rs.getString(4));
				l.setInputRequire(rs.getString(5));
				l.setOutputRequire(rs.getString(6));
				l.setInputTestCase(rs.getString(7));
				l.setOutputTestCase(rs.getString(8));
				l.setExplain(rs.getString(9));
				l.setInputUser(rs.getString(10));

				list.add(l);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}
	
	/*
	 * get problem by subid
	 */
	public Problem getProblemBySubId(String subId) {
		Problem l = new Problem();
		String sql = "select * from Problem where subId="+subId;
		try {

			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				
				l.setProId(rs.getInt(1));
				l.setSubId(rs.getInt(2));
				l.setDescription(rs.getString(3));
				l.setConstrain(rs.getString(4));
				l.setInputRequire(rs.getString(5));
				l.setOutputRequire(rs.getString(6));
				l.setInputTestCase(rs.getString(7));
				l.setOutputTestCase(rs.getString(8));
				l.setExplain(rs.getString(9));
				l.setInputUser(rs.getString(10));

			 
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return l;
	}

	public void insertProblem(Problem Problem) {
		String sql = "insert into Problem values(?,?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement pr = con.prepareStatement(sql);
			pr.setInt(1, Problem.getSubId());
			pr.setString(2, Problem.getDescription());
			pr.setString(3, Problem.getConstrain());
			pr.setString(4, Problem.getInputRequire());
			pr.setString(5, Problem.getOutputRequire());
			pr.setString(6, Problem.getInputTestCase());
			pr.setString(7, Problem.getOutputTestCase());
			pr.setString(8, Problem.getExplain());
			pr.setString(9, Problem.getInputUser());
			pr.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// update
	public void updateProblem(Problem Problem) {
		String sql = "update Problem set subIdId=?,description=?,constrain=?, inputRequire=?,outputRequire=?, inputTestcase=?, outputTestcase=?, explain=?, inputUser=? where proId=?";
		try {
			PreparedStatement pr = con.prepareStatement(sql);
			pr.setInt(1, Problem.getSubId());
			pr.setString(2, Problem.getDescription());
			pr.setString(3, Problem.getConstrain());
			pr.setString(4, Problem.getInputRequire());
			pr.setString(5, Problem.getOutputRequire());
			pr.setString(6, Problem.getInputTestCase());
			pr.setString(7, Problem.getOutputTestCase());
			pr.setString(8, Problem.getExplain());
			pr.setString(9, Problem.getInputUser());
			pr.setInt(10, Problem.getProId());

			pr.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// delete
	public void deleteProblem(int proId) {
		String sql = "delete from Problem where proId='" + proId + "'";
		try {
			Statement st = con.createStatement();
			st.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
