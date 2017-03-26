package model.bean;

public class Subject {
	private int subId;
	private int cateId;
	private String title;
	private float successRate;
	private int maxScore;
	private String difficutly;

	public Subject() {
		super();
	}

	public Subject(int subId, int cateId, String title, float successRate,
			int maxScore, String difficutly) {
		super();
		this.subId = subId;
		this.cateId = cateId;
		this.title = title;
		this.successRate = successRate;
		this.maxScore = maxScore;
		this.difficutly = difficutly;
	}

	public int getSubId() {
		return subId;
	}

	public void setSubId(int subId) {
		this.subId = subId;
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

	public float getSuccessRate() {
		return successRate;
	}

	public void setSuccessRate(float successRate) {
		this.successRate = successRate;
	}

	public int getMaxScore() {
		return maxScore;
	}

	public void setMaxScore(int maxScore) {
		this.maxScore = maxScore;
	}

	public String getDifficutly() {
		return difficutly;
	}

	public void setDifficutly(String difficutly) {
		this.difficutly = difficutly;
	}

}
