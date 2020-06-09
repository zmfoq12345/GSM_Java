import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class HelloServlet extends HttpServlet {
	protected void service(HttpServletRequest req, HttpServletResponse res) 
			throws ServletException, IOException {
		res.setContentType("text/html;charset=euc-kr");
		PrintWriter out = res.getWriter();

		out.println("<html><body><pre>");
		out.println("3209_¾çÇö½Â_HelloServlet");
		out.println("</pre></body></html>");
		out.flush();
	}
}
