package kr.gsm.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.gsm.model.MyUtil;

/**
 * Servlet implementation class TotalController
 */
@WebServlet("/tot.do")
public class TotalController extends HttpServlet {
	protected void service(HttpServletRequest req, HttpServletResponse res) 
			throws ServletException, IOException {
		
		int num1 = Integer.parseInt(req.getParameter("num1"));
		int num2 = Integer.parseInt(req.getParameter("num2"));
	
		MyUtil my = new MyUtil();
		int result = my.toCnt(num1, num2);
		
		res.setContentType("text/html;charset=euc-kr");
		PrintWriter out = res.getWriter();
		out.println("<html><body><pre>");
		out.println(num1+"~"+num2+"<br>");
		out.println("3209_¾çÇö½Â:" + result);
		out.println("</pre></body></html>");
		out.flush();
		
	}
	
}
