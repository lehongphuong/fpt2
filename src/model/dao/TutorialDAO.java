package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.bean.Tutorial;

public class TutorialDAO
{

	Connection con = null;

	public TutorialDAO() {
		super();
		this.con = DBConnect.getConnect();
	}

	/*
	 *get all Tutorial
	 */
	public ArrayList<Tutorial> getAllTutorial() {
		ArrayList<Tutorial> list = new ArrayList<>();
		String sql = "select * from Tutorial";
		try {
			
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				Tutorial l = new Tutorial();
				l.setTuId(rs.getInt(1));
				l.setCateId(rs.getInt(2));
				l.setTitle(rs.getString(3));
				l.setPositive(rs.getInt(4));
				l.setActive(rs.getBoolean(5));
				
				list.add(l);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}
	
	/*
	 *get all Tutorial by cate id
	 */
	public ArrayList<Tutorial> getAllTutorialByCateId(String cateId) {
		ArrayList<Tutorial> list = new ArrayList<>();
		String sql = "select * from Tutorial where cateId="+cateId;
		try {
			
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				Tutorial l = new Tutorial();
				l.setTuId(rs.getInt(1));
				l.setCateId(rs.getInt(2));
				l.setTitle(rs.getString(3));
				l.setPositive(rs.getInt(4));
				l.setActive(rs.getBoolean(5));
				
				list.add(l);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}

	
	public void insertTutorial(Tutorial tutorial) {
		String sql = "insert into Tutorial values(?,?,?,?)";
		try {
			PreparedStatement pr = con.prepareStatement(sql);
			
			pr.setInt(1, tutorial.getCateId());
			pr.setString(2, tutorial.getTitle());
			pr.setInt(3, tutorial.getPositive());
			pr.setBoolean(4, tutorial.isActive());
 
			pr.executeUpdate(); 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// update
	public void updateTutorial(Tutorial tutorial) {
		String sql = "update Tutorial set subId=?,title=?, positive=?, active=? where tuId=?";
		try {
			PreparedStatement pr = con.prepareStatement(sql);
			
			pr.setInt(1, tutorial.getCateId());
			pr.setString(2, tutorial.getTitle());
			pr.setInt(3, tutorial.getPositive());
			pr.setBoolean(4, tutorial.isActive());
			pr.setInt(5, tutorial.getTuId());
			 
			pr.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// delete
	public void deleteTutorial(int tuId) {
		String sql = "delete from Tutorial where tuId='" + tuId + "'";
		try {
			Statement st = con.createStatement();
			st.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
