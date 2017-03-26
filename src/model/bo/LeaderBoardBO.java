package model.bo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.bean.LeaderBoard;
import model.dao.LeaderBoardDAO;

public class LeaderBoardBO {
	LeaderBoardDAO dao = new LeaderBoardDAO();

	/*
	 * get all categories
	 */
	public ArrayList<LeaderBoard> getAllLeaderbBoard() {
		return dao.getAllLeaderbBoard();
	}

	/*
	 * get all leaderboard of subject with subId
	 */
	public ArrayList<LeaderBoard> getAllLeaderbBoardBySubId(String subId) {
		return dao.getAllLeaderbBoardBySubId(subId);
	}

	/*
	 * check user id exists
	 */
	public boolean isUserExists(String userId) {
		return dao.isUserExists(userId);
	}

	public void insertLeaderBoard(LeaderBoard LeaderBoard) {
		dao.insertLeaderBoard(LeaderBoard);

	}

	// update
	public void updateLeaderBoard(LeaderBoard LeaderBoard) {
		dao.updateLeaderBoard(LeaderBoard);
	}

	// delete
	public void deleteLeaderBoard(int leadId) {
		dao.deleteLeaderBoard(leadId);
	}
}
