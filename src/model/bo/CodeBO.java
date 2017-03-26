package model.bo;

import java.util.ArrayList;

import model.bean.Code;
import model.dao.CodeDAO;

public class CodeBO {
	CodeDAO dao=new CodeDAO();
	
	/*
	 *get all categories
	 */
	public ArrayList<Code> getAllCode() {
		return dao.getAllCode();
	}

	
	public void insertCode(Code Code) {
		dao.insertCode(Code);
	}

	// update
	public void updateCode(Code Code) {
		dao.updateCode(Code);
	}

	// delete
	public void deleteCode(int codeId) {
		dao.deleteCode(codeId);
	}
}
