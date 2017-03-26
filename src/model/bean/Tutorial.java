package model.bean;

public class Tutorial {
	private int tuId;
	private int cateId;
	private String title;
	private int positive;
	private boolean active;

	public Tutorial() {
		super();
	}

	public Tutorial(int tuId, int cateId, String title, int positive, boolean active) {
		super();
		this.tuId = tuId;
		this.cateId = cateId;
		this.title = title;
		this.positive = positive;
		this.active = active;
	}

	public int getTuId() {
		return tuId;
	}

	public void setTuId(int tuId) {
		this.tuId = tuId;
	}

	public int getCateId() {
		return cateId;
	}

	public void setCateId(int cateId) {
		this.cateId = cateId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPositive() {
		return positive;
	}

	public void setPositive(int positive) {
		this.positive = positive;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

}
