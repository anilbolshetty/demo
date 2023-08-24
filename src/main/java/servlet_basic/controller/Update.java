package servlet_basic.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet_basic.dao.PatientDao;
@WebServlet("/update")
public class Update extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id=req.getParameter("id");
		String number=req.getParameter("number");
		
		int cid=Integer.parseInt(id);
		long cnumber=Long.parseLong(number);
		
		System.out.println(cid);
		System.out.println(cnumber);
		
		PatientDao dao=new PatientDao();
		String msg=dao.update(cid, cnumber);
		resp.getWriter().print(msg);
	}

}
