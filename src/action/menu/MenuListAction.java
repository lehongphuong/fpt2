package action.menu;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bean.Menu;
import model.bo.MenuBO;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import form.menu.MenuForm;

public class MenuListAction extends Action{
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		MenuForm menuForm=(MenuForm)form;
		
		MenuBO menuBO=new MenuBO();
		
		ArrayList<Menu> menuList=menuBO.getAllMenu();
		
		
		menuForm.setMenuList(menuList);
		for(Menu m: menuList){
			System.out.println(""+m.getMenuId());
			System.out.println(""+m.getName());
			System.out.println(""+m.getPositive());
		}
		
		
		
		
		
		return mapping.findForward("thanhCong");
	}

}
