<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@page import="java.util.*" %>
<%@page import="kr.gsm.model.*" %>

<%
	List<MemberVO> list = (List<MemberVO>)request.getAttribute("list");
%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>3209_������_ȸ������Ʈ ���(View)</h1>
<table border="1" width="300px">
	<tr>
		<td>ID</td>
		<td>PW</td>
		<td>AGE</td>
	</tr>
<%
	for (MemberVO i : list){ 
	if(i.getId().equals("������")){
%>
	<tr bgcolor = "skyblue">
		<td><%=i.getId()%></td>
		<td><%=i.getPw()%></td>
		<td><%=i.getAge()%></td>
		<td><a href ="memDelete.do?id=<%=i.getId()%>">����</a></td>
	</tr>	
	<%}else{%>
	<tr>
		<td><%=i.getId()%></td>
		<td><%=i.getPw()%></td>
		<td><%=i.getAge()%></td>
		<td><a href ="memDelete.do?id=<%=i.getId()%>">����</a></td>
	</tr>	
	<% } %>

<% } %>
	<tr>
		<td colspan="3" align="right">
			<a href = "Member.html"> ȸ������ </a>
		</td>
	</tr>
</table>

</body>
</html>