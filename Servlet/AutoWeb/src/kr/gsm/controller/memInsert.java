package kr.gsm.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.gsm.model.MemberDAO;
import kr.gsm.model.MemberVO;

@WebServlet("/memInsert.me")
public class memInsert extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String id = req.getParameter("id");
		String pw = req.getParameter("pw");
		int age = Integer.parseInt(req.getParameter("age"));
		
		MemberVO vo = new MemberVO(id, pw, age);
		MemberDAO dao = new MemberDAO();
		
		int cnt = dao.memInssert(vo);
		if (cnt > 0) {
			res.sendRedirect("list.do");
		}else {
			throw new ServletException("½ÇÆÐ");
		}
		
	}
}
