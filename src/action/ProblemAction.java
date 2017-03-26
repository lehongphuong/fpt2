package action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bean.Status;
import model.bean.User;
import model.bo.CategoriesBO;
import model.bo.StatusBO;
import model.bo.SubjectBO;
import model.bo.UserBO;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import common.MyCookie;

import form.PracticsForm;

public class ProblemAction extends Action{
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		PracticsForm practicsForm = (PracticsForm) form;
		String cateId = request.getParameter("cateId");
		String menuId = request.getParameter("menuId");

		CategoriesBO categoriesBO = new CategoriesBO();
		SubjectBO subjectBO=new SubjectBO();
		
		UserBO userBO = new UserBO();

		/**
		 * LAY DU LIEU NGUOI DUNG
		 */
		MyCookie myCookie = new MyCookie(request, response);
		String statusLogin = myCookie.getCookie("statusLogin");
		User user = new User();
		if (statusLogin == null) {
			statusLogin = "notLogin";
		}

		// kiem tra va lay thong tin neu dang nhap thanh cong
		if ("login".equals(statusLogin)) {
			// dang nhap thanh cong
			user = userBO.getOneUserById(myCookie.getCookie("userId"));
			practicsForm.setUserId(user.getUserId() + "");
			practicsForm.setUsername(user.getUsername());
			practicsForm.setPassword(user.getPassword());
			practicsForm.setAvatar(user.getAvatar());
			practicsForm.setUniversity(user.getUniversity());
			practicsForm.setPoint(user.getPoint() + "");
			practicsForm.setTypeUser(user.getTypeUser());
			//get du lieu cho rank dua vao point
			practicsForm.setRank(""+userBO.getRankUserById(user.getUserId()));
		}
		practicsForm.setStatusLogin(statusLogin);
		
		/**
		 * KET THUC LAY DU LIEU NGUOI DUNG
		 */
		
		// set du lieu cho form
		practicsForm.setCateId(cateId);
		practicsForm.setMenuId(menuId);
		//set list categories
		practicsForm.setCateList(categoriesBO.getAllCategories());
		//set list subject
		practicsForm.setSubList(subjectBO.getAllSubjectByCateId(cateId));
		
		//get du lieu cho status button dua vao bang status
		StatusBO statusBO=new StatusBO();
		ArrayList<Status> statusList=statusBO.getAllStatus();
		practicsForm.setStatusList(statusList);
		request.setAttribute("statusList", statusList);

		return mapping.findForward("thanhCong");
	}

}
