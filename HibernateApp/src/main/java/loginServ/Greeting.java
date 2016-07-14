package loginServ;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Greeting extends HttpServlet{
	
	/**
	 * Generated serial id
	 */
	private static final long serialVersionUID = -703980434469498486L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	    req.setAttribute("firstname", req.getParameter("firstname"));
		req.getRequestDispatcher("/greet.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//req.getRequestDispatcher("/Task").forward(req, resp);
		doGet(req, resp);
	}
	
	

}
