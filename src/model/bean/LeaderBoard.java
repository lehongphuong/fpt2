package model.bean;

public class LeaderBoard {

	private int leadId;
	private int subId;
	private int userId;
	private int submitId;

	public LeaderBoard() {
		super();
	}

	public LeaderBoard(int leadId, int subId, int userId, int submitId) {
		super();
		this.leadId = leadId;
		this.subId = subId;
		this.userId = userId;
		this.submitId = submitId;
	}

	public int getSubmitId() {
		return submitId;
	}

	public void setSubmitId(int submitId) {
		this.submitId = submitId;
	}

	public int getLeadId() {
		return leadId;
	}

	public void setLeadId(int leadId) {
		this.leadId = leadId;
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

 
}
