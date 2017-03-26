package model.bean;

public class Code {
	private int codeId;
	private int submitId;
	private String code;

	public Code() { 
		super();
	}

	public Code(int codeId, int submitId, String code) {
		super();
		this.codeId = codeId;
		this.submitId = submitId;
		this.code = code;
	}

	public int getCodeId() {
		return codeId;
	}

	public void setCodeId(int codeId) {
		this.codeId = codeId;
	}

	public int getSubmitId() {
		return submitId;
	}

	public void setSubmitId(int submitId) {
		this.submitId = submitId;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

}
