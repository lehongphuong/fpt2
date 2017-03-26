package model.bo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.bean.Status;
import model.dao.StatusDAO;

public class StatusBO {
StatusDAO dao=new StatusDAO();
/*
 *get all categories
 */
public ArrayList<Status> getAllStatus() {
	return dao.getAllStatus();
}

/*
 * get all status by user id
 */
public ArrayList<Status> getAllStatuByUserId(String userId) {
	return dao.getAllStatuByUserId(userId);
}



public void insertStatus(Status Status) {
	dao.insertStatus(Status);
}

// update
public void updateStatus(Status Status) {
	dao.updateStatus(Status);
}

// delete
public void deleteStatus(int statusId) {
	dao.deleteStatus(statusId);
}
}
