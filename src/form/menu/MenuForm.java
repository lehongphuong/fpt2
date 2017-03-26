package form.menu;

import java.util.ArrayList;

import model.bean.Menu;

import org.apache.struts.action.ActionForm;

public class MenuForm extends ActionForm {
	private int menuId;
	private String name;
	private int positive;

	public int getMenuId() {
		return menuId;
	}

	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPositive() {
		return positive;
	}

	public void setPositive(int positive) {
		this.positive = positive;
	}

	public ArrayList<Menu> getMenuList() {
		return menuList;
	}

	public void setMenuList(ArrayList<Menu> menuList) {
		this.menuList = menuList;
	}

	ArrayList<Menu> menuList;

}
