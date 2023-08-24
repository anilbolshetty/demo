package servlet_basic.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet_basic.dao.PatientDao;
import servlet_basic.dto.PatientDto;
@WebServlet("/updatedetails")
public class UpdateAll extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id=req.getParameter("pid");
		String name=req.getParameter("uname");
		String email=req.getParameter("uemail");
		String password=req.getParameter("upwd");
		String number=req.getParameter("unumber");
		String gender=req.getParameter("ugender");
		String country=req.getParameter("ucountry");
		String checkbox=req.getParameter("ucheckbox");
		System.out.println(id);
		System.out.println(name);
		System.out.println(email);
		System.out.println(password);
		System.out.println(number);
		System.out.println(gender);
		System.out.println(country);
		System.out.println(checkbox);
		
		int cid=Integer.parseInt(id);
		long cnumber=Long.parseLong(number);
		
		PatientDto dto=new PatientDto();
		dto.setId(cid);
		dto.setName(name);
		dto.setEmail(email);
		dto.setCountry(country);
		dto.setPassword(password);
		dto.setPhonenumber(cnumber);
		dto.setGender(gender);
		dto.setCheckbox(checkbox);
		
		PatientDao dao=new PatientDao();
		String msg=dao.updateall(dto);
		
	}

}
