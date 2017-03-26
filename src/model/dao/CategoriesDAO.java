package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.bean.Categories;


public class CategoriesDAO {
	//coment hien and ngoc nuong
	Connection con = null;

	public CategoriesDAO() {
		super();
		this.con = DBConnect.getConnect();
	}

	/*
	 *get all categories
	 */
	public ArrayList<Categories> getAllCategories() {
		ArrayList<Categories> list = new ArrayList<>();
		String sql = "select * from Categories";
		try {
			
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				Categories l = new Categories();
				l.setCateId(rs.getInt(1));
				l.setMenuId(rs.getInt(2));
				l.setName(rs.getString(3));
				
				list.add(l);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}

	 

	
	public void insertCategories(Categories categories) {
		String sql = "insert into Categories values(?,?)";
		try {
			PreparedStatement pr = con.prepareStatement(sql);
			pr.setInt(1, categories.getMenuId());
			pr.setString(2, categories.getName());
 
			pr.executeUpdate(); 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// update
	public void updateCategories(Categories categories) {
		String sql = "update Categories set menuId=?,name=? where cateId=?";
		try {
			PreparedStatement pr = con.prepareStatement(sql);
			
			pr.setInt(1, categories.getMenuId());
			pr.setString(2, categories.getName());
			pr.setInt(3, categories.getCateId());
			 
			pr.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// delete
	public void deleteCategories(int cateId) {
		String sql = "delete from Categories where cateId='" + cateId + "'";
		try {
			Statement st = con.createStatement();
			st.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
