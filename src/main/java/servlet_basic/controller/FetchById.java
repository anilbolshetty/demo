package servlet_basic.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet_basic.dao.PatientDao;
import servlet_basic.dto.PatientDto;
@WebServlet("/fetchbyid")
public class FetchById extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		
		String id=req.getParameter("pk");
		int cid=Integer.parseInt(id);
		
		PatientDao dao=new PatientDao();
		PatientDto dto=dao.FetchById(cid);
		
		
		
//		if(dto!=null)
//		resp.getWriter().print(dto);
//		else
//			System.out.println("data not found");
		
	}

}
