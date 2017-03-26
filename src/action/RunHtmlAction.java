package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bean.User;
import model.bo.CategoriesBO;
import model.bo.SubjectBO;
import model.bo.TutorialBO;
import model.bo.TutorialCodeBO;
import model.bo.UserBO;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import common.MyCookie;

import form.TutorialsForm;

public class RunHtmlAction extends Action{
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		TutorialsForm tf = (TutorialsForm) form;
		String cateId = request.getParameter("cateId");
		String menuId = request.getParameter("menuId");
		String tutId = request.getParameter("tutId");
		String tutCodeId = request.getParameter("tutCodeId");

	 
		TutorialCodeBO tutorialCodeBO=new TutorialCodeBO();
		tf.setTutCode(tutorialCodeBO.getOneTutCodeById(tutCodeId));
		 

		return mapping.findForward("thanhCong");
	}

}
