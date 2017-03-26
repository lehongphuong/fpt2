package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.bean.Code;

//coment hien LJKLK
public class CodeDAO {
	Connection con = null;

	public CodeDAO() {
		super();
		this.con = DBConnect.getConnect();
	}

	/*
	 *get all categories
	 */
	public ArrayList<Code> getAllCode() {
		ArrayList<Code> list = new ArrayList<>();
		String sql = "select * from Code";
		try {
			
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				Code l = new Code();
				l.setCodeId(rs.getInt(1));
				l.setSubmitId(rs.getInt(2));
				l.setCode(rs.getString(3));
				
				list.add(l);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}

	
	public void insertCode(Code Code) {
		String sql = "insert into Code values(?,?)";
		try {
			PreparedStatement pr = con.prepareStatement(sql);
			pr.setInt(1, Code.getSubmitId());
			pr.setString(2, Code.getCode());
 
			pr.executeUpdate(); 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// update
	public void updateCode(Code Code) {
		String sql = "update Code set submitId=?, code=? where codeId=?";
		try {
			PreparedStatement pr = con.prepareStatement(sql);
			
			pr.setInt(1, Code.getSubmitId());
			pr.setString(2, Code.getCode());
			pr.setInt(3, Code.getCodeId());
			 
			pr.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// delete
	public void deleteCode(int codeId) {
		String sql = "delete from Code where codeId='" + codeId + "'";
		try {
			Statement st = con.createStatement();
			st.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
