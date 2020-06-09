<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
	int sum = 0;
	for (int i = 0; i < 10; i++){
		sum+=i+1;
	}
%>
<table border = "1">
<tr>
	<td>3209_양현승</td>
	<td><%=sum%></td>
</tr>
</table>
</body>
</html>