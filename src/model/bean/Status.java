package model.bean;

public class Status {
	private int statusId;
	private int userId;
	private int subId;
	private boolean status;

	public Status() {
		super();
	}

	public Status(int statusId, int userId, int subId, boolean status) {
		super();
		this.statusId = statusId;
		this.userId = userId;
		this.subId = subId;
		this.status = status;
	}

	public int getStatusId() {
		return statusId;
	}

	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getSubId() {
		return subId;
	}

	public void setSubId(int subId) {
		this.subId = subId;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}
