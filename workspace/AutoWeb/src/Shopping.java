import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/sh.do")
public class Shopping extends HttpServlet {
	protected void service(HttpServletRequest req, HttpServletResponse res) 
			throws ServletException, IOException {
		int result=0;
		for(int i = 1; i <= 100; i++){
			if(i%2 == 0){
				result+=i;	
			}
		}
		System.out.println("3209������:"+result);
	
		res.setContentType("text/html;charset=euc-kr");
		PrintWriter out = res.getWriter();
		out.println("<html>");
		out.println("<body");
		out.println("3209������:"+result);
		out.println("</body");
		out.println("</html>");
	}

}
