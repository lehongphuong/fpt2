package action;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.bean.User;
import model.bo.UserBO;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import common.MyCookie;

import form.HomeForm;

public class LoginAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		// TODO Auto-generated method stub
		HomeForm homeForm = (HomeForm) form;
		UserBO userBO = new UserBO();
		
		
		String username = homeForm.getUsername();
		String password = homeForm.getPassword();
		
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		
		// get cookie theo mang
		MyCookie myCookie=new MyCookie(request, response);
		String statusLogin = myCookie.getCookie("statusLogin");
		
		if("notLogin".equals(statusLogin)||"fail".equals(statusLogin)){
			//chua dang nhap
			if(userBO.isUser(user)){
				//dang nhap thanh cong
				myCookie.setCookie("statusLogin", "login");
				myCookie.setCookie("userId", userBO.getOneUserByName(username).getUserId()+"");
			}else{
				//dang nhap that bai
				myCookie.setCookie("statusLogin", "fail");
				
			}
		}

		return mapping.findForward("thanhCong");
	}

}
