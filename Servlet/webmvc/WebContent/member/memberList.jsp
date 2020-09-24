<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@page import="java.util.*" %>
<%@page import="kr.gsm.model.*"%>    
<%
    ArrayList<MemberVO> list=(ArrayList<MemberVO>)request.getAttribute("list");
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript">
	function memform(){
		location.href="member/member.html"
	}

</script>
</head>
<body>
    - 회원리스트-
<table border="1">
   <tr>
     <td>번호</td>
     <td>학번</td>
     <td>이름</td>
     <td>전화번호</td>
     <td>이메일</td>
     <td>주소</td>
   </tr>
   <% for(MemberVO vo : list){ %>
         <tr>
            <td><%=vo.getNum()%></td>
            <td><%=vo.getBun()%></td>
            <td><%=vo.getName()%></td>
            <td><%=vo.getTel()%></td>
            <td><%=vo.getEmail()%></td>
            <td><%=vo.getAddr()%></td>
          </tr>
   <%   }   %>
   <tr>
	   <td>
	   		<input type="button" values="회원가입" onclick="memform()"/>
	   </td>
   </tr>
</table>    
</body>
</html>