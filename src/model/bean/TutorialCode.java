package model.bean;

public class TutorialCode {
	private int tuCoId;
	private int tuId;
	private String title;
	private String description;
	private String code;
	private int positive;

	public TutorialCode() {
		super();
	}

	TutorialCode(int tuCoId, int tuId, String title, String description,
			String code, int positive) {
		super();
		this.tuCoId = tuCoId;
		this.tuId = tuId;
		this.title = title;
		this.description = description;
		this.code = code;
		this.positive = positive;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getTuCoId() {
		return tuCoId;
	}

	public void setTuCoId(int tuCoId) {
		this.tuCoId = tuCoId;
	}

	public int getTuId() {
		return tuId;
	}

	public void setTuId(int tuId) {
		this.tuId = tuId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getPositive() {
		return positive;
	}

	public void setPositive(int positive) {
		this.positive = positive;
	}
}
