package model.bean;

import org.json.JSONException;
import org.json.JSONObject;

public class Response {

	private String output;
	private String langid;
	private String code;
	private String errors;
	private String time;

	/**
	 * get object from string json
	 * 
	 * @param response
	 */
	public Response(String response) {
		super();
		// chuyen ket qua tra ve thanh json va lay ra gia tri
		try {
			JSONObject json = new JSONObject(response);
			this.output = json.getString("output");
			this.langid = json.getString("langid");
			this.code = json.getString("code");
			this.errors = json.getString("errors");
			this.time = json.getString("time");
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Response() {
		super();
	}

	public Response(String output, String langid, String code, String errors, String time) {
		super();
		this.output = output;
		this.langid = langid;
		this.code = code;
		this.errors = errors;
		this.time = time;
	}

	public String getOutput() {
		return output;
	}

	public void setOutput(String output) {
		this.output = output;
	}

	public String getLangid() {
		return langid;
	}

	public void setLangid(String langid) {
		this.langid = langid;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getErrors() {
		return errors;
	}

	public void setErrors(String errors) {
		this.errors = errors;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

}
