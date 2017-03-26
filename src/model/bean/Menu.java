package model.bean;

public class Menu {
	private int menuId;
	private String name;
	private int positive;

	public Menu() {
		super();
	}

	public Menu(int menuId, String name, int positive) {
		super();
		this.menuId = menuId;
		this.name = name;
		this.positive = positive;
	}

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

}
