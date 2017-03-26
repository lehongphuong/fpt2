package common;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyCookie {

	private HttpServletResponse response;
	private HttpServletRequest request;

	public MyCookie() {

	}

	public MyCookie( HttpServletRequest request,HttpServletResponse response) {
		super();
		this.response = response;
		this.request = request;
	}

	public void setCookie(String key, String value) {
		Cookie ck = new Cookie(key, value);
		response.addCookie(ck);
	}
	
	public String getCookie(String key){
		for (Cookie c : request.getCookies()) {
			if (key.equals(c.getName())) {
				return c.getValue();
			}
		}
		return null;
	}

}
