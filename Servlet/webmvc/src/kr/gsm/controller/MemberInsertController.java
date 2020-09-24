package kr.gsm.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.gsm.model.MemberDAO;
import kr.gsm.model.MemberVO;
@WebServlet("/insert")
public class MemberInsertController extends HttpServlet {
   protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      // 클라이언트의 요청을 받는 작업
      request.setCharacterEncoding("euc-kr");
      int bun=Integer.parseInt(request.getParameter("bun"));
      String name=request.getParameter("name");
      String tel=request.getParameter("tel");
      String email=request.getParameter("email");
      String addr=request.getParameter("addr");
      MemberVO vo=new MemberVO();
      vo.setBun(bun);
      vo.setName(name);
      vo.setTel(tel);
      vo.setEmail(email);
      vo.setAddr(addr);
      // Model과 연동(DAO)
      MemberDAO dao = new MemberDAO();
      int cnt=dao.memberInsert(vo);
      PrintWriter out = response.getWriter();
      if(cnt>0) {
//         out.print("success");
    	  response.sendRedirect("list");
    	  
      }else {
         out.print("failed");
      }
   }
}