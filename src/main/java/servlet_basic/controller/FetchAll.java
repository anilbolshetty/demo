package servlet_basic.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet_basic.dao.PatientDao;
import servlet_basic.dto.PatientDto;
@WebServlet("/fetchall")
public class FetchAll extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
//		super.doGet(req, resp);
		PatientDao dao=new PatientDao();
		List<PatientDto> d1=dao.fetchall();
		resp.getWriter().print(d1);
		req.setAttribute("objects",d1);
		
		RequestDispatcher rd=req.getRequestDispatcher("download.jsp");
		rd.forward(req, resp);
		resp.sendRedirect("http://www.facebook.com");
		
	}

}
