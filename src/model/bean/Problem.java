package model.bean;

public class Problem {
	private int proId;
	private int subId;
	private String description;
	private String constrain;
	private String inputRequire;
	private String outputRequire;
	private String inputTestCase;
	private String outputTestCase;
	private String explain;
	private String inputUser;

	public Problem() {
		super();
	}

	public Problem(int proId, int subId, String description, String constrain,
			String inputRequire, String outputRequire, String inputTestCase,
			String outputTestCase, String explain, String inputUser) {
		super();
		this.proId = proId;
		this.subId = subId;
		this.description = description;
		this.constrain = constrain;
		this.inputRequire = inputRequire;
		this.outputRequire = outputRequire;
		this.inputTestCase = inputTestCase;
		this.outputTestCase = outputTestCase;
		this.explain = explain;
		this.inputUser = inputUser;
	}

	public int getProId() {
		return proId;
	}

	public void setProId(int proId) {
		this.proId = proId;
	}

	public int getSubId() {
		return subId;
	}

	public void setSubId(int subId) {
		this.subId = subId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getConstrain() {
		return constrain;
	}

	public void setConstrain(String constrain) {
		this.constrain = constrain;
	}

	public String getInputRequire() {
		return inputRequire;
	}

	public void setInputRequire(String inputRequire) {
		this.inputRequire = inputRequire;
	}

	public String getOutputRequire() {
		return outputRequire;
	}

	public void setOutputRequire(String outputRequire) {
		this.outputRequire = outputRequire;
	}

	public String getInputTestCase() {
		return inputTestCase;
	}

	public void setInputTestCase(String inputTestCase) {
		this.inputTestCase = inputTestCase;
	}

	public String getOutputTestCase() {
		return outputTestCase;
	}

	public void setOutputTestCase(String outputTestCase) {
		this.outputTestCase = outputTestCase;
	}

	public String getExplain() {
		return explain;
	}

	public void setExplain(String explain) {
		this.explain = explain;
	}

	public String getInputUser() {
		return inputUser;
	}

	public void setInputUser(String inputUser) {
		this.inputUser = inputUser;
	}

}
