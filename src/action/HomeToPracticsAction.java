package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import form.PracticsForm;
import form.TutorialsForm;

public class HomeToPracticsAction extends Action{
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String map="";
		String menuId=request.getParameter("menuId");
		String cateId=request.getParameter("cateId");
		String tutId=request.getParameter("tutId");
		
		if("1".equals(menuId)){
//			TutorialsForm practicsForm=(TutorialsForm)form;
			map="tutorials";
		}else{
			PracticsForm practicsForm=(PracticsForm)form;
			request.setAttribute("cateId",cateId);
			request.setAttribute("menuId",menuId);
			request.setAttribute("tutId",tutId);
			map="practics";
		}
		return mapping.findForward(map);
	}

}