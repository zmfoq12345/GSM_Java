<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	int sum=(Integer)request.getAttribute("data");    
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
3213_이동건<br/>
1~100까지의 수중에서 3의 배수의 총합=<%=sum %>
</body>
</html>