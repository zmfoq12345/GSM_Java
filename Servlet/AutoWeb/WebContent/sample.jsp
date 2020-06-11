<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<%-- 
	<% %> : 스크립틀릿
	<%! : 선언문
--%>

<%!
public int toHap(){
	int a = 100;
	int b = 300;
	return a+b;
}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%  
	int v = toHap(); 
%>
<table border = '1'>
	<tr>
		<td>결과</td>
		<td><%=v%></td>
	</tr>
</table>
</body>
</html>