package action.menu;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bean.Menu;
import model.bo.MenuBO;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import form.menu.MenuForm;

public class MenuPrepareUpdateAction extends Action {
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		MenuForm menuForm = (MenuForm) form;
		
		String menuId=request.getParameter("menuId");

		MenuBO menuBO=new MenuBO();
		
		Menu menu=menuBO.getOneMenuById(menuId);
		
		menuForm.setMenuId(menu.getMenuId());
		menuForm.setName(menu.getName());
		menuForm.setPositive(menu.getPositive());
		

		return mapping.findForward("thanhCong");
	}

}
