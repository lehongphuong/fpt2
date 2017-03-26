package action.menu;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bo.MenuBO;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import form.menu.MenuForm;

public class MenuDeleteAction extends Action{
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		MenuForm menuForm=(MenuForm)form;
		
		String menuId=request.getParameter("menuId");

		MenuBO menuBO=new MenuBO();
		
		menuBO.deleteMenu(Integer.parseInt(menuId));
		
		return mapping.findForward("thanhCong");
	}

} 
