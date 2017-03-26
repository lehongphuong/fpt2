package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.bean.LeaderBoard;

public class LeaderBoardDAO {
	Connection con = null;

	public LeaderBoardDAO() {
		super();
		this.con = DBConnect.getConnect();
	}

	/*
	 * get all categories
	 */
	public ArrayList<LeaderBoard> getAllLeaderbBoard() {
		ArrayList<LeaderBoard> list = new ArrayList<>();
		String sql = "select * from Leaderboard";
		try {

			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				LeaderBoard l = new LeaderBoard();
				l.setLeadId(rs.getInt(1));
				l.setSubId(rs.getInt(2));
				l.setUserId(rs.getInt(3));
				l.setSubmitId(rs.getInt(4));

				list.add(l);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}

	/*
	 * get all leaderboard of subject with subId
	 */
	public ArrayList<LeaderBoard> getAllLeaderbBoardBySubId(String subId) {
		ArrayList<LeaderBoard> list = new ArrayList<>();
		String sql = "select * from Leaderboard where subid=" + subId;
		try {

			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				LeaderBoard l = new LeaderBoard();
				l.setLeadId(rs.getInt(1));
				l.setSubId(rs.getInt(2));
				l.setUserId(rs.getInt(3));
				l.setSubmitId(rs.getInt(4));
				list.add(l);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}

	/*
	 * check user id exists
	 */
	public boolean isUserExists(String userId) {
		String sql = "select * from Leaderboard where userId=" + userId;
		try {

			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

	public void insertLeaderBoard(LeaderBoard LeaderBoard) {
		String sql = "insert into Leaderboard values(?,?,?)";
		try {
			PreparedStatement pr = con.prepareStatement(sql);
			pr.setInt(1, LeaderBoard.getSubId());
			pr.setInt(2, LeaderBoard.getUserId());
			pr.setInt(3, LeaderBoard.getSubmitId());
			pr.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// update
	public void updateLeaderBoard(LeaderBoard LeaderBoard) {
		String sql = "update Leaderboard set subId=?, userId=?, submitId=? where leadId=?";
		try {
			PreparedStatement pr = con.prepareStatement(sql);

			pr.setInt(1, LeaderBoard.getSubId());
			pr.setInt(2, LeaderBoard.getUserId());
			pr.setInt(3, LeaderBoard.getSubmitId());
			pr.setInt(4, LeaderBoard.getLeadId());

			pr.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// delete
	public void deleteLeaderBoard(int leadId) {
		String sql = "delete from Leaderboard where leadId='" + leadId + "'";
		try {
			Statement st = con.createStatement();
			st.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
