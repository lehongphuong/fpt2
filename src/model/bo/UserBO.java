package model.bo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.bean.User;
import model.dao.DBConnect;
import model.dao.UserDAO;

public class UserBO {

	UserDAO dao = new UserDAO();

	/*
	 * check user login
	 */
	public boolean isUser(User user) {
		return dao.isUser(user);
	}
	
	/*
	 *get one User by id
	 */
	public User getOneUserById(String userId) {
		return dao.getOneUserById(userId);
	}
	
	/*
	 *get rank User by id
	 */
	public int getRankUserById(int userId) {
		return dao.getRankUserById(userId);
	}
	
	
	/*
	 *get one User by name
	 */
	public User getOneUserByName(String username) {
		return dao.getOneUserByName(username);
	}

	/*
	 * get all User
	 */
	public ArrayList<User> getAllUser() {
		return dao.getAllUser();
	}

	public void insertUser(User user) {
		dao.insertUser(user);

	}

	// update
	public void updateUser(User user) {
		dao.updateUser(user);
	}

	// delete
	public void deleteUser(int userId) {
		dao.deleteUser(userId);
	}

}
