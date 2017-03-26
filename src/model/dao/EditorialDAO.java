package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.bean.Editorial;

public class EditorialDAO {
	Connection con = null;

	public EditorialDAO() {
		super();
		this.con = DBConnect.getConnect();
	}

	/*
	 * get all categories
	 */
	public ArrayList<Editorial> getAllEditorial() {
		ArrayList<Editorial> list = new ArrayList<>();
		String sql = "select * from Editorial";
		try {

			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				Editorial l = new Editorial();
				l.setEditId(rs.getInt(1));
				l.setSubId(rs.getInt(2));
				l.setExplain(rs.getString(3));
				l.setCode(rs.getString(4));
				l.setLanguage(rs.getString(5));

				list.add(l);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}

	/*
	 * get editorial by subid
	 */
	public Editorial getAllEditorialBySubId(String subId) {
		Editorial l = new Editorial();
		String sql = "select * from Editorial where subId=" + subId;
		try {

			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {

				l.setEditId(rs.getInt(1));
				l.setSubId(rs.getInt(2));
				l.setExplain(rs.getString(3));
				l.setCode(rs.getString(4));
				l.setLanguage(rs.getString(5));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return l;
	}

	public void insertEditorial(Editorial Editorial) {
		String sql = "insert into Editorial values(?,?,?,?)";
		try {
			PreparedStatement pr = con.prepareStatement(sql);
			pr.setInt(1, Editorial.getSubId());
			pr.setString(2, Editorial.getExplain());
			pr.setString(3, Editorial.getCode());
			pr.setString(4, Editorial.getLanguage());

			pr.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// update
	public void updateEditorial(Editorial Editorial) {
		String sql = "update Categories set subId=?,explain=?,code=?, language=? where editId=?";
		try {
			PreparedStatement pr = con.prepareStatement(sql);

			pr.setInt(1, Editorial.getSubId());
			pr.setString(2, Editorial.getExplain());
			pr.setString(3, Editorial.getCode());
			pr.setString(4, Editorial.getLanguage());
			pr.setInt(5, Editorial.getEditId());

			pr.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// delete
	public void deleteEditorial(int editId) {
		String sql = "delete from Editorial where editId='" + editId + "'";
		try {
			Statement st = con.createStatement();
			st.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
