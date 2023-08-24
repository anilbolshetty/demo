<%@page import="servlet_basic.dto.PatientDto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="">
<tr>
<th> NAME</th>
<th> Id</th>

<th> COUNTRY</th>
<th> EMAIL</th>
<th> GENDER</th>

<th> PASSWORD</th>
<th>PHONENUMBER</th>
<th> CHECKBOX</th>
<th>delete</th>

</tr>
<%List<PatientDto> list=(List<PatientDto>)request.getAttribute("objects");%>
<%for(PatientDto pd:list){%>
<tr>
<td><%=pd.getName()%></td>
<td><%=pd.getId()%></td>
<td><%=pd.getCountry()%></td>

<td><%=pd.getEmail()%></td>
<td><%=pd.getGender()%></td>

<td><%=pd.getPassword()%></td>
<td><%=pd.getPhonenumber()%></td>
<td><%=pd.getCheckbox()%></td>
<td>
<a href="delete?pk=<%=pd.getId()%>">remove</a>
</td>
<td>
<a href="update.jsp?id=<%=pd.getId()%>&&name=<%=pd.getName()%>&&email=<%=pd.getEmail()%>&&password=<%=pd.getPassword()%>&&number=<%=pd.getPhonenumber()%>&&gender=<%=pd.getGender()%>&&checkbox=<%=pd.getCheckbox()%>&&country=<%=pd.getCountry()%>">update</a>
</td>


</tr>
<%}%>








</table>

</body>
</html>