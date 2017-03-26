package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.bean.User;



public class UserDAO 
{
	Connection con = null;

	public UserDAO() {
		super();
		this.con = DBConnect.getConnect();
	}
	
	/*
	 *check user login
	 */
	public boolean isUser(User user) {
		ArrayList<User> list = new ArrayList<>();
		String sql = "select * from User1 where username='"+user.getUsername()+"' and password='"+user.getPassword()+"' ";
		try {
			
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			int ans=0;
			while (rs.next()) {
				ans++;
			}
			if(ans>0) return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

	/*
	 *get all User
	 */
	public ArrayList<User> getAllUser() {
		ArrayList<User> list = new ArrayList<>();
		String sql = "select * from User1";
		try {
			
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				User l = new User();
				l.setUserId(rs.getInt(1));
				l.setUsername(rs.getString(2));
				l.setPassword(rs.getString(3));
				l.setAvatar(rs.getString(4));
				l.setUniversity(rs.getString(5));
				l.setPoint(rs.getFloat(6));
				l.setTypeUser(rs.getString(7));
				
				list.add(l);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}
	
	/*
	 *get one User by id
	 */
	public User getOneUserById(String userId) {
		User l = new User();
		String sql = "select * from User1 where userId="+userId+" ";
		try {
			
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				
				l.setUserId(rs.getInt(1));
				l.setUsername(rs.getString(2));
				l.setPassword(rs.getString(3));
				l.setAvatar(rs.getString(4));
				l.setUniversity(rs.getString(5));
				l.setPoint(rs.getFloat(6));
				l.setTypeUser(rs.getString(7));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return l;
	}
	
	/*
	 *get rank User by id
	 */
	public int getRankUserById(int userId) {
		int rank=1;
		User l = new User();
		String sql = "select * from User1 order by point desc";
		try {
			
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				if(rs.getInt(1)==userId){
					break;
				}
				rank++;
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return rank;
	}
	
	/*
	 *get one User by name
	 */
	public User getOneUserByName(String username) {
		User l = new User();
		String sql = "select * from User1 where username='"+username+"' ";
		try {
			
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				
				l.setUserId(rs.getInt(1));
				l.setUsername(rs.getString(2));
				l.setPassword(rs.getString(3));
				l.setAvatar(rs.getString(4));
				l.setUniversity(rs.getString(5));
				l.setPoint(rs.getFloat(6));
				l.setTypeUser(rs.getString(7));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return l;
	}

	
	public void insertUser(User user) {
		String sql = "insert into User1 values(?,?,?,?,?,?)";
		try {
			PreparedStatement pr = con.prepareStatement(sql);
			
			pr.setString(1, user.getUsername());
			pr.setString(2, user.getPassword());
			pr.setString(3, user.getAvatar());
			pr.setString(4, user.getUniversity());
			pr.setFloat(5, user.getPoint());
			pr.setString(6, user.getTypeUser());
 
			pr.executeUpdate(); 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// update
	public void updateUser(User user) {
		String sql = "update User1 set username=?,password=?, avatar=?, university=?, point=?, typeUser=? where userId=?";
		try {
			PreparedStatement pr = con.prepareStatement(sql);
			
			pr.setString(1, user.getUsername());
			pr.setString(2, user.getPassword());
			pr.setString(3, user.getAvatar());
			pr.setString(4, user.getUniversity());
			pr.setFloat(5, user.getPoint());
			pr.setString(6, user.getTypeUser());
			pr.setInt(7, user.getUserId());
			 
			pr.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// delete
	public void deleteUser(int userId) {
		String sql = "delete from User1 where userId='" + userId + "'";
		try {
			Statement st = con.createStatement();
			st.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
