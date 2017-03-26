package model.bo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.bean.Menu;
import model.dao.MenuDAO;

public class MenuBO {
 MenuDAO dao=new MenuDAO();
 
	/*
	 *get all categories
	 */
	public ArrayList<Menu> getAllMenu() {
		return dao.getAllMenu();
	}

	
	public void insertMenu(Menu Menu) {
		dao.insertMenu(Menu);

	}

	// update
	public void updateMenu(Menu Menu) {
		dao.updateMenu(Menu);
	}

	// delete
	public void deleteMenu(int menuId) {
		dao.deleteMenu(menuId);
	}
	

	/*
	 *get all categories
	 */
	public Menu getOneMenuById(String menuId) {
		return dao.getOneMenuById(menuId); 
				
	}

}
