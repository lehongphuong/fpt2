package common;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import model.bean.Response;

public class CompilerCode {

	private static final String USER_AGENT = "Mozilla/5.0";

	private static final String POST_URL = "https://compile-public-low.remoteinterview.io/compile";

	private String language;
	private String code;
	private String userInput;
	private String postParams;

	public CompilerCode() {
		super();
	}

	public CompilerCode(String language, String code, String userInput) {
		super();
		this.language = language;
		this.code = code;
		this.userInput = userInput;

		if ("cpp".equals(language)) {
			postParams = "language=7&code=";
		}
		if ("java".equals(language)) {
			postParams = "language=8&code=";
		}
		if ("python".equals(language)) {
			postParams = "language=0&code=";
		}
		if ("php".equals(language)) {
			postParams = "language=3&code=";
		}

		try {
			code = URLEncoder.encode(code, "UTF-8");
			postParams += code + "&stdin=" + userInput + "&name=asdf";
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		postParams += code + "&stdin=" + userInput + "&name=asdf";

	}

	public static void main(String[] args) {
		String c="#include <iostream>\r\nusing namespace std;\r\n\r\nint main() {\r\n    cout<<\"Helsdf lo\";\r\n    for(int i=0;i<10;i++){\r\n        cout<<i*i<<endl;\r\n    }\r\n    return 0;\r\n}";
		String c1="#include <iostream>\r\nusing namespace std;\r\n\r\nint main() {\r\n    int a; cin>>a; cout<<a;   \r\n    return 0;\r\n}";
		String p="#include <iostream> using namespace std; int main() { int a; cin>>a; cout<<a;    return 0; }";
		String x="%23include+%3Ciostream%3E%0Ausing+namespace+std%3B%0A%0Aint+main()+%7B%0A++++int+a%3B%0A++++cin%3E%3Ea%3B%0A++++cout%3C%3Ca%3B%0A++++return+0%3B%0A%7D";
		
		CompilerCode code=new CompilerCode("c++", c1, "33");

		String response = code.runCodeC();

		Response res = new Response(response);

		System.out.println(res.getCode());
		System.out.println(res.getOutput());
		System.out.println(res.getErrors());

	}

	public String runCodeC() {
		String result = "";
		try {
			URL obj = new URL(POST_URL);
			HttpURLConnection con = (HttpURLConnection) obj.openConnection();
			con.setRequestMethod("POST");
			con.setRequestProperty("User-Agent", USER_AGENT);

			// For POST only - START
			con.setDoOutput(true);
			OutputStream os = con.getOutputStream();
			os.write(this.postParams.getBytes());
			os.flush();
			os.close();
			// For POST only - END

			int responseCode = con.getResponseCode();
			// System.out.println("POST Response Code :: " + responseCode);

			if (responseCode == HttpURLConnection.HTTP_OK) { // success
				BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
				String inputLine;
				StringBuffer response = new StringBuffer();

				while ((inputLine = in.readLine()) != null) {
					response.append(inputLine);
				}
				in.close();

				result = response.toString();

				// print result
//				 System.out.println(response.toString());
			} else {
				// System.out.println("POST request not worked");
			}
		} catch (Exception e) {
			System.out.println(e.getStackTrace());

		}

		return result;
	}

	public String getPostParams() {
		return postParams;
	}

	public void setPostParams(String postParams) {
		this.postParams = postParams;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getUserInput() {
		return userInput;
	}

	public void setUserInput(String userInput) {
		this.userInput = userInput;
	}

}
