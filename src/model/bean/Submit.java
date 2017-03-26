package model.bean;

public class Submit {
	private int submitId;
	private int subId;
	private int userId;
	private String time;
	private float point;
	private String code;
	private String language;

	public Submit() {
		super();
	}

	public Submit(int submitId, int subId, int userId, String time, float point, String code, String language) {
		super();
		this.submitId = submitId;
		this.subId = subId;
		this.userId = userId;
		this.time = time;
		this.point = point;
		this.code = code;
		this.language = language;
	}

	/**
	 * @return the language
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * @param language
	 *            the language to set
	 */
	public void setLanguage(String language) {
		this.language = language;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getSubmitId() {
		return submitId;
	}

	public void setSubmitId(int submitId) {
		this.submitId = submitId;
	}

	public int getSubId() {
		return subId;
	}

	public void setSubId(int subId) {
		this.subId = subId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public float getPoint() {
		return point;
	}

	public void setPoint(float point) {
		this.point = point;
	}

}
