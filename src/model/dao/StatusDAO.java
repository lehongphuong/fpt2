package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.bean.Status;

public class StatusDAO {
	Connection con = null;

	public StatusDAO() {
		super();
		this.con = DBConnect.getConnect();
	}

	/*
	 * get all categories
	 */
	public ArrayList<Status> getAllStatus() {
		ArrayList<Status> list = new ArrayList<>();
		String sql = "select * from Status";
		try {

			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				Status l = new Status();
				l.setStatusId(rs.getInt(1));
				l.setUserId(rs.getInt(2));
				l.setSubId(rs.getInt(3));
				l.setStatus(rs.getBoolean(4));
				list.add(l);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}
	
	/*
	 * get all status by user id
	 */
	public ArrayList<Status> getAllStatuByUserId(String userId) {
		ArrayList<Status> list = new ArrayList<>();
		String sql = "select * from Status where userId="+userId;
		try {

			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				Status l = new Status();
				l.setStatusId(rs.getInt(1));
				l.setUserId(rs.getInt(2));
				l.setSubId(rs.getInt(3));
				l.setStatus(rs.getBoolean(4));
				list.add(l);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}

	public void insertStatus(Status Status) {
		String sql = "insert into Status values(?,?,?)";
		try {
			PreparedStatement pr = con.prepareStatement(sql);
			pr.setInt(1, Status.getUserId());
			pr.setInt(2, Status.getSubId());
			pr.setBoolean(3, Status.isStatus());

			pr.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// update
	public void updateStatus(Status Status) {
		String sql = "update Categories set userId=?,subId=?, status=? where statusId=?";
		try {
			PreparedStatement pr = con.prepareStatement(sql);

			pr.setInt(1, Status.getUserId());
			pr.setInt(2, Status.getSubId());
			pr.setBoolean(3, Status.isStatus());

			pr.setInt(4, Status.getStatusId());

			pr.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// delete
	public void deleteStatus(int statusId) {
		String sql = "delete from Status where statusId='" + statusId + "'";
		try {
			Statement st = con.createStatement();
			st.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
