package model.bean;

public class TestCase {
	private int testId;
	private int subId;
	private String input;
	private String output;
	private float timeAsk;

	public TestCase() {
		super();
	}

	public TestCase(int testId, int subId, String input, String output,
			float timeAsk) {
		super();
		this.testId = testId;
		this.subId = subId;
		this.input = input;
		this.output = output;
		this.timeAsk = timeAsk;
	}

	public int getTestId() {
		return testId;
	}

	public void setTestId(int testId) {
		this.testId = testId;
	}

	public int getSubId() {
		return subId;
	}

	public void setSubId(int subId) {
		this.subId = subId;
	}

	public String getInput() {
		return input;
	}

	public void setInput(String input) {
		this.input = input;
	}

	public String getOutput() {
		return output;
	}

	public void setOutput(String output) {
		this.output = output;
	}

	public float getTimeAsk() {
		return timeAsk;
	}

	public void setTimeAsk(float timeAsk) {
		this.timeAsk = timeAsk;
	}

}
