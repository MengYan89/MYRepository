package test;

import java.util.List;

import DAO.EmpDAO;
import bean.Emd;

public class test {
	public static void main(String[] args) {
		Emd emd = new Emd();
		EmpDAO dao = new EmpDAO();
		List<Emd> list = dao.getAll();
		System.out.println(list);
		emd = dao.get(1);
		System.out.println(emd);
	}

}
