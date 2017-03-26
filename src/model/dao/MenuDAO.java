package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.bean.Menu;

public class MenuDAO {
	Connection con = null;

	public MenuDAO() {
		super();
		this.con = DBConnect.getConnect();
	}

	/*
	 *get all categories
	 */
	public ArrayList<Menu> getAllMenu() {
		ArrayList<Menu> list = new ArrayList<>();
		String sql = "select * from menu";
		try {
			
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				Menu l = new Menu();
				l.setMenuId(rs.getInt(1));
				l.setName(rs.getString(2));
				l.setPositive(rs.getInt(3));
				
				list.add(l);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}
	
	/*
	 *get all categories
	 */
	public Menu getOneMenuById(String menuId) {
		Menu l = new Menu();
		String sql = "select * from menu where menuId='"+menuId+"'  ";
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				l.setMenuId(rs.getInt(1));
				l.setName(rs.getString(2));
				l.setPositive(rs.getInt(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return l;
	}

	
	public void insertMenu(Menu Menu) {
		String sql = "insert into menu values(?,?)";
		try {
			PreparedStatement pr = con.prepareStatement(sql);
			pr.setString(1, Menu.getName());
			pr.setInt(2, Menu.getPositive());

			pr.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// update
	public void updateMenu(Menu Menu) {
		String sql = "update menu set name=?,positive=? where menuId=?";
		try {
			PreparedStatement pr = con.prepareStatement(sql);
			
			pr.setString(1, Menu.getName());
			pr.setInt(2, Menu.getPositive());
			pr.setInt(3, Menu.getMenuId());
			 
			pr.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// delete
	public void deleteMenu(int menuId) {
		String sql = "delete from menu where menuId='" + menuId + "'";
		try {
			Statement st = con.createStatement();
			st.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
