package kr.gsm.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
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
		List<MemberVO> list = dao.getAllList(); 
		
		// View to JSP
		req.setAttribute("list", list);
		RequestDispatcher rd = req.getRequestDispatcher("MemberList.jsp");
		rd.forward(req, res);
		
	}
}
