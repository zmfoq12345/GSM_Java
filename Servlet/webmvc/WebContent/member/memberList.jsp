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
    - ȸ������Ʈ-
<table border="1">
   <tr>
     <td>��ȣ</td>
     <td>�й�</td>
     <td>�̸�</td>
     <td>��ȭ��ȣ</td>
     <td>�̸���</td>
     <td>�ּ�</td>
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
	   		<input type="button" values="ȸ������" onclick="memform()"/>
	   </td>
   </tr>
</table>    
</body>
</html>