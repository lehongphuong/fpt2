package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import form.TutorialsForm;

public class RunCodeAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		TutorialsForm tf = (TutorialsForm) form;
		System.out.println("run code");
		String language = request.getParameter("language");
		String code = tf.getCode();

		if ("c++".equals(language)) {
			
		}
		if ("java".equals(language)) {

		}
		if ("python".equals(language)) {

		}
		System.out.println(language);
		System.out.println(code);

		return mapping.findForward("thanhCong");
	}

}