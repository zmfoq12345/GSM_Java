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
	int result=0;
	for(int i = 1; i <= 100; i++){
		if(i%2 == 0){
			result+=i;	
		}
	}
%>
<h1>1~100까지 짝수의 합 : <%=result%></h1>
</body>
</html>