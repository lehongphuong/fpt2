package action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bean.Categories;
import model.bean.Menu;
import model.bean.User;
import model.bo.CategoriesBO;
import model.bo.MenuBO;
import model.bo.UserBO;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import common.MyCookie;

import form.HomeForm;

public class HomeAction extends Action {
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		HomeForm homeForm = (HomeForm) form;
		UserBO userBO = new UserBO();

		/**
		 * LAY DU LIEU NGUOI DUNG
		 */
		MyCookie myCookie = new MyCookie(request, response);
		String statusLogin = myCookie.getCookie("statusLogin");
		User user = new User();

		if (statusLogin == null) {
			statusLogin = "notLogin";
			myCookie.setCookie("statusLogin", statusLogin);
		}

		// kiem tra va lay thong tin neu dang nhap thanh cong
		if ("login".equals(statusLogin)) {
			// dang nhap thanh cong
			user = userBO.getOneUserById(myCookie.getCookie("userId"));
			homeForm.setUserId(user.getUserId() + "");
			homeForm.setUsername(user.getUsername());
			homeForm.setPassword(user.getPassword());
			homeForm.setAvatar(user.getAvatar());
			homeForm.setUniversity(user.getUniversity());
			homeForm.setPoint(user.getPoint() + "");
			homeForm.setTypeUser(user.getTypeUser());
		}
		homeForm.setStatusLogin(statusLogin);

		/**
		 * KET THUC LAY DU LIEU NGUOI DUNG
		 */

		// set du lieu cho menu va categorie
		MenuBO menuBO = new MenuBO();
		CategoriesBO categoriesBO = new CategoriesBO();

		ArrayList<Menu> menuList = menuBO.getAllMenu();
		ArrayList<Categories> cateList = categoriesBO.getAllCategories();

		homeForm.setMenuList(menuList);
		homeForm.setCateList(cateList);

		return mapping.findForward("thanhCong");
	}

}
