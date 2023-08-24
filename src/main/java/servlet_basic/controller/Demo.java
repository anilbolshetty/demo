package servlet_basic.controller;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import net.bytebuddy.dynamic.ClassFileLocator.PackageDiscriminating;
import servlet_basic.dao.PatientDao;
import servlet_basic.dto.PatientDto;
@WebServlet("/hi")
public class Demo implements Servlet {

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
//		System.out.println("welcome to servlets");
//		res.getWriter().print("<h1>welcome to servlets</h1>");
		String id=req.getParameter("id");
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		String tel=req.getParameter("phonenumber");
		String gender=req.getParameter("gender");
		String checkbox=req.getParameter("checkbox");
		String country=req.getParameter("country");
		
		
		int cid=Integer.parseInt(id);
		long phonenumber=Long.parseLong(tel);
		PatientDto dto=new PatientDto();
		dto.setId(cid);
		dto.setName(name);
		dto.setEmail(email);
		dto.setPassword(password);
		dto.setPhonenumber(phonenumber);
		dto.setGender(gender);
		dto.setCheckbox(checkbox);
		dto.setCountry(country);
		System.out.println(dto);
		
		
				PatientDao dao=new PatientDao();
				dao.insert(dto);
		
		
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

}
