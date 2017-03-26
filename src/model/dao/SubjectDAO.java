package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.bean.Subject;

public class SubjectDAO {
	Connection con = null;

	public SubjectDAO() {
		super();
		this.con = DBConnect.getConnect();
	}

	/*
	 * get all categories
	 */
	public ArrayList<Subject> getAllSubject() {
		ArrayList<Subject> list = new ArrayList<>();
		String sql = "select * from Subject";
		try {

			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				Subject l = new Subject();
				l.setSubId(rs.getInt(1));
				l.setCateId(rs.getInt(2));
				l.setTitle(rs.getString(3));
				l.setSuccessRate(rs.getFloat(4));
				l.setMaxScore(rs.getInt(5));
				l.setDifficutly(rs.getString(6));

				list.add(l);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}

	/*
	 * get all subject by cate id
	 */
	public ArrayList<Subject> getAllSubjectByCateId(String cateId) {
		ArrayList<Subject> list = new ArrayList<>();
		String sql = "select * from Subject where cateId='" + cateId + "' ";
		try {

			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				Subject l = new Subject();
				l.setSubId(rs.getInt(1));
				l.setCateId(rs.getInt(2));
				l.setTitle(rs.getString(3));
				l.setSuccessRate(rs.getFloat(4));
				l.setMaxScore(rs.getInt(5));
				l.setDifficutly(rs.getString(6));

				list.add(l);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}

	/*
	 * get one subject by subId
	 */
	public Subject getOneSubjectBySubId(String subId) {
		Subject l = new Subject();
		String sql = "select * from Subject where subId='" + subId + "' ";
		try {

			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {

				l.setSubId(rs.getInt(1));
				l.setCateId(rs.getInt(2));
				l.setTitle(rs.getString(3));
				l.setSuccessRate(rs.getFloat(4));
				l.setMaxScore(rs.getInt(5));
				l.setDifficutly(rs.getString(6));

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return l;
	}

	public void insertSubject(Subject Subject) {
		String sql = "insert into Subject values(?,?,?,?,?)";
		try {
			PreparedStatement pr = con.prepareStatement(sql);
			pr.setInt(1, Subject.getCateId());
			pr.setString(2, Subject.getTitle());
			pr.setFloat(3, Subject.getSuccessRate());
			pr.setInt(4, Subject.getMaxScore());
			pr.setString(5, Subject.getDifficutly());

			pr.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// update
	public void updateSubject(Subject Subject) {
		String sql = "update Subject set cateId=?, title=?, successRate=?, maxScore=?, Difficutly=? where subId=?";
		try {
			PreparedStatement pr = con.prepareStatement(sql);

			pr.setInt(1, Subject.getCateId());
			pr.setString(2, Subject.getTitle());
			pr.setFloat(3, Subject.getSuccessRate());
			pr.setInt(4, Subject.getMaxScore());
			pr.setString(5, Subject.getDifficutly());
			pr.setInt(6, Subject.getSubId());

			pr.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// delete
	public void deleteSubject(int subId) {
		String sql = "delete from Subject where subId='" + subId + "'";
		try {
			Statement st = con.createStatement();
			st.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
