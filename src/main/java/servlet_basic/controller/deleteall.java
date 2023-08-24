package servlet_basic.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet_basic.dao.PatientDao;
@WebServlet("/deleteall")
public class deleteall extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PatientDao dao=new PatientDao();
	String msg=	dao.deleteall();
	resp.getWriter().print(msg);
	}
}
