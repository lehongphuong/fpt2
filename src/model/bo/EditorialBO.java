package model.bo;

import java.util.ArrayList;

import model.bean.Editorial;
import model.dao.EditorialDAO;

public class EditorialBO {
	EditorialDAO dao = new EditorialDAO();

	/*
	 * get all categories
	 */
	public ArrayList<Editorial> getAllEditorial() {
		return dao.getAllEditorial();
	}

	/*
	 * get editorial by subid
	 */
	public Editorial getAllEditorialBySubId(String subId) {
		return dao.getAllEditorialBySubId(subId);
	}

	public void insertEditorial(Editorial Editorial) {
		dao.insertEditorial(Editorial);

	}

	// update
	public void updateEditorial(Editorial Editorial) {
		dao.updateEditorial(Editorial);
	}

	// delete
	public void deleteEditorial(int editId) {
		dao.deleteEditorial(editId);

	}
}
