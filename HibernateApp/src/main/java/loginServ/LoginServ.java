package loginServ;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServ extends HttpServlet {

	/**
	 * Default serial id
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.getRequestDispatcher("/login.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// Login logic
		String firstName = req.getParameter("firstname").toString();
		String password = req.getParameter("password").toString();

		if (!"root".equals(firstName) || !"steaua".equals(password)) {
			// not correct
			// go back to login
			doGet(req, resp);
		} else {
			// correct! Greet!
			req.setAttribute("firstname", firstName);
			req.getRequestDispatcher("/greet.jsp").forward(req, resp);
		}
	}



	

}
