package model.bean;

public class Categories {
	private int cateId;
	private int menuId;
	private String name;

	public Categories() {
		super();
	}

	public Categories(int cateId, int menuId, String name) {
		super();
		this.cateId = cateId;
		this.menuId = menuId;
		this.name = name;
	}

	public int getCateId() {
		return cateId;
	}

	public void setCateId(int cateId) {
		this.cateId = cateId;
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

}
