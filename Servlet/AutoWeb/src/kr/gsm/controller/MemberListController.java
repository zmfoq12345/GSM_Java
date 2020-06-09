package kr.gsm.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.gsm.model.*;

/**
 * Servlet implementation class MemberListController
 */
@WebServlet("/list.do")
public class MemberListController extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		MemberDAO dao = new MemberDAO();
		List<MemberVo> list = dao.getAllList(); 
		
		res.setContentType("text/html;charset=euc-kr");
		PrintWriter out = res.getWriter();
		out.println("<html><body><pre>");
		out.println("<h1>회원 목록 리스트</h1>");
		out.println("<table border = '1' width='300px'>");
		
		out.println("<tr>");
		out.println("<td>ID</td>");
		out.println("<td>PW</td>");
		out.println("<td>NAME</td>");
		out.println("</tr>");
		for (MemberVo i:list) {
			out.println("<tr>");
			out.println("<td>"+i.getId()+"</td>");
			out.println("<td>"+i.getPw()+"</td>");
			out.println("<td>"+i.getAge()+"</td>");
			out.println("</tr>");
		}
		out.println("</table>");
		out.println("</pre></body></html>");
		out.flush();
		
		
	}
}
