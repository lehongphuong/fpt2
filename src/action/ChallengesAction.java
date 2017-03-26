package action;

import java.net.URLDecoder;
import java.time.LocalDateTime;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import common.CompilerCode;
import common.MyCookie;
import form.ChallengesForm;
import model.bean.LeaderBoard;
import model.bean.Problem;
import model.bean.Response;
import model.bean.Status;
import model.bean.Subject;
import model.bean.Submit;
import model.bean.TestCase;
import model.bean.User;
import model.bo.CategoriesBO;
import model.bo.EditorialBO;
import model.bo.LeaderBoardBO;
import model.bo.ProblemBO;
import model.bo.StatusBO;
import model.bo.SubjectBO;
import model.bo.SubmitBO;
import model.bo.TestCaseBO;
import model.bo.UserBO;

public class ChallengesAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		ChallengesForm challengesForm = (ChallengesForm) form;
		String cateId = request.getParameter("cateId");
		String menuId = request.getParameter("menuId");
		String subId = request.getParameter("subId");
		String userId = "";

		CategoriesBO categoriesBO = new CategoriesBO();
		SubjectBO subjectBO = new SubjectBO();

		UserBO userBO = new UserBO();
		
		challengesForm.setUserList(userBO.getAllUser());

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
			challengesForm.setUserId(user.getUserId() + "");
			userId = user.getUserId() + "";
			challengesForm.setUsername(user.getUsername());
			challengesForm.setPassword(user.getPassword());
			challengesForm.setAvatar(user.getAvatar());
			challengesForm.setUniversity(user.getUniversity());
			challengesForm.setPoint(user.getPoint() + "");
			challengesForm.setTypeUser(user.getTypeUser());
			// get du lieu cho rank dua vao point
			challengesForm.setRank("" + userBO.getRankUserById(user.getUserId()));
		}
		challengesForm.setStatusLogin(statusLogin);

		/**
		 * KET THUC LAY DU LIEU NGUOI DUNG
		 */

		/**
		 * CAP NHAT TRANG THAI CHO BUTTON TRY AGAIN TRONG BANG STATUS DU VAO
		 * SUBID VA USERID
		 */
		StatusBO statusBO = new StatusBO();
		Status status = new Status();
		status.setUserId(Integer.parseInt(userId));
		status.setSubId(Integer.parseInt(subId));
		status.setStatus(true);
		statusBO.insertStatus(status);

		/**
		 * KET THUC CAP NHAT TRANG THAI CHO BUTTON TRY AGAIN TRONG BANG STATUS
		 * DU VAO SUBID VA USERID
		 */

		// set du lieu cho form
		challengesForm.setCateId(cateId);
		challengesForm.setMenuId(menuId);
		// set list categories
		challengesForm.setCateList(categoriesBO.getAllCategories());
		// set list subject
		Subject subject = subjectBO.getOneSubjectBySubId(subId);
		challengesForm.setSubject(subject);
		// get du lieu cho status button dua vao bang status
		ArrayList<Status> statusList = statusBO.getAllStatus();

		request.setAttribute("statusList", statusList);

		// get information for problem page
		ProblemBO problemBO = new ProblemBO();
		Problem problem = problemBO.getProblemBySubId(subId);
		challengesForm.setProblem(problem);

		// set editorial by submit id
		EditorialBO editorialBO = new EditorialBO();

		challengesForm.setEditorial(editorialBO.getAllEditorialBySubId(subId));

		/**
		 * khoi tao editor
		 */
		String run = request.getParameter("run");
		String editor = request.getParameter("editor");
		if (run == null) {
			challengesForm.setEditor("cpp");
			challengesForm.setCodeSample(URLDecoder.decode("%23include+%3Ciostream%3E%0D%0Ausing+namespace+std%3B%0D%0A%0D%0Aint+main%28%29+%7B%0D%0A++++cout%3C%3C%22Helsdf+lo%22%3B%0D%0A++++for%28int+i%3D0%3Bi%3C10%3Bi%2B%2B%29%7B%0D%0A++++++++cout%3C%3Ci%2Ai%3C%3Cendl%3B%0D%0A++++%7D%0D%0A++++return+0%3B%0D%0A%7D"));
			if ("java".equals(editor)) {
				challengesForm.setEditor("JAVA");
				challengesForm.setCodeSample(URLDecoder.decode("import+java.io.*%3B%0Aimport+java.io.*%3B%0Aimport+java.util.*%3B%0Aimport+java.text.*%3B%0Aimport+java.math.*%3B%0Aimport+java.util.regex.*%3B%0A%0Aclass+myCode%0A%7B%0A++++public+static+void+main+(String%5B%5D+args)+throws+java.lang.Exception%0A++++%7B%0A++++++++Scanner+in+%3D+new+Scanner(System.in)%3B%0A++++++++int+n+%3D+in.nextInt()%3B%0A++++++++System.out.println(%22Hello+Java+%22%2Bn)%3B%0A++++%7D%0A%7D%0A"));
			}

			if ("python".equals(editor)) {
				challengesForm.setEditor("PYTHON");
				challengesForm.setCodeSample(URLDecoder.decode("a%3Draw_input()%0Aprint+'Hello+'%2Ba"));
			}
		} else {

			challengesForm.setEditor("cpp");

			if ("java".equals(editor)) {
				challengesForm.setEditor("JAVA");

			}

			if ("python".equals(editor)) {
				challengesForm.setEditor("PYTHON");

			}

		}
		/**
		 * end khoi tao editor
		 */

		/**
		 * run code hoac submit
		 */
		challengesForm.setRun("false");
		// if thay doi editor thi van chay xuong
		String submit = challengesForm.getSubmit();
		if (submit != null) {

			challengesForm.setRun("true");
			String codeSample = challengesForm.getCodeSample();
			String inputUser = challengesForm.getInputUser();

			if ("runCode".equals(submit)) {
				// runcode lay gia tri trong code sample xu ly
				challengesForm.setRun("runCode");

				String input = problem.getInputTestCase();
				if (inputUser == null) {
					// neu user khong nhap test case thi dung cua he thong
					challengesForm.setInputTestCase(problem.getInputTestCase());
					challengesForm.setOutputTestCase(problem.getOutputTestCase());
				} else {
					// dung test case cua user
					challengesForm.setInputTestCase(inputUser);
					input = inputUser;
				}

				/**
				 * compiler run code
				 * 
				 */
				// compiler and run code
				String language = request.getParameter("editor");
				if (language != null)
					language = language.trim();
				String yourOutput = "";
				CompilerCode compilerCode = new CompilerCode(language, codeSample, input);
				String response1 = compilerCode.runCodeC();
				Response res = new Response(response1);
				yourOutput = res.getOutput();
				challengesForm.setYourOutput(yourOutput);
				challengesForm.setError(res.getErrors());

			} else {
				/**
				 * submit code
				 */
				challengesForm.setRun("submit");
				TestCaseBO testCaseBO = new TestCaseBO();
				ArrayList<TestCase> tcList = testCaseBO.getAllTestCaseBySubjectId(subId);
				int sz = tcList.size();
				challengesForm.setNumberTestCase("" + sz);
				int testCasePass = 0;
				// khai bao de compiler code
				String language = request.getParameter("editor");
				if (language != null) {
					language = language.trim();
				}

				for (TestCase testCase : tcList) {
					CompilerCode compilerCode = new CompilerCode(language, codeSample, testCase.getInput());
					String response1 = compilerCode.runCodeC();
					Response res = new Response(response1);
					System.out.println(res.getOutput() + " " + testCase.getOutput().trim());
					System.out.println(res.getTime() + " " + testCase.getTimeAsk());
					// check compiller success
					if ("".equals(res.getErrors())) {
						// check time request and output
						if (Float.parseFloat(res.getTime()) < testCase.getTimeAsk()
								&& testCase.getOutput().trim().equals(res.getOutput().trim())) {
							testCasePass++;
						}
					} else {
						challengesForm.setError(res.getErrors());
						break;
					}

				}

				challengesForm.setTestCasePass(testCasePass + "");

				if (testCasePass == sz) {
					challengesForm.setResult("Success Full !");
				} else {
					challengesForm.setResult("Faile Please try again  !");
				}

				/**
				 * sau khi commit xong thi se cap nhat lai submitted, leader
				 * board point cua nguoi dung voi dieu kien chi cap nhat 1 lan
				 * duy nhat
				 */
				SubmitBO submitBO = new SubmitBO();
				LeaderBoardBO leaderBoardBO = new LeaderBoardBO();
				
				
				// 1. submit
				Submit submit2 = new Submit(); 
				submit2.setSubId(Integer.parseInt(subId));
				submit2.setUserId(Integer.parseInt(userId));
				submit2.setTime(LocalDateTime.now().toString());
				float point = (float) ((float)testCasePass / sz) * subject.getMaxScore();
				submit2.setPoint(point);
				submit2.setCode(codeSample);
				submit2.setLanguage(language); 
				int submitId = submitBO.insertSubmit(submit2);
				
				// 2. leaderboard
				if (testCasePass == sz) {
					if (!leaderBoardBO.isUserExists(userId)) {
						LeaderBoard leaderBoard = new LeaderBoard();
						leaderBoard.setSubId(Integer.parseInt(subId));
						leaderBoard.setUserId(Integer.parseInt(userId));
						leaderBoard.setSubmitId(submitId);
						leaderBoardBO.insertLeaderBoard(leaderBoard);
					}
				}
				// 3. point

			}
			challengesForm.setCodeSample(codeSample);
		}

		/**
		 * end run code hoac submit
		 */

		// set info for submition with userId and subMit id and after show all
		SubmitBO submitBO = new SubmitBO();
		challengesForm.setSubmitList(submitBO.getAllSubmitOfUserWithSubId(userId, subId));
		
		challengesForm.setSubmitListLead(submitBO.getAllSubmitLead(subId));
		// set infor for leaderbord with sub id
		LeaderBoardBO leaderBoardBO = new LeaderBoardBO();
		challengesForm.setLeaderList(leaderBoardBO.getAllLeaderbBoardBySubId(subId));

		return mapping.findForward("thanhCong");
	}

}