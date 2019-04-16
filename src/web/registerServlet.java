package web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import comment.Users;
import service.UserService;
import service.UserServiceImpl;

/**
 * Servlet implementation class registerServlet
 */
@WebServlet("/register")
public class registerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public registerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		request.setCharacterEncoding("utf-8");
		
		String userName = request.getParameter("username");
		String passWord1 = request.getParameter("password1");
		String passWord2 = request.getParameter("password2");
		
		UserService stuService = new UserServiceImpl();
		List<Users> list = stuService.list();
		int flag = 0;
		for (Users user: list) {
			if(user.getUserName().equals(userName) ) {
				flag = 1;
				break;
			}	
		}
		
		if(1 == flag) {
			request.setAttribute("tip", "userName already exists");
			request.getRequestDispatcher("register.jsp").forward(request, response);
		}
		else {
			
			if( (!passWord2.equals(passWord1)) ) {
				request.setAttribute("tip", "Enter a different password");
				request.getRequestDispatcher("register.jsp").forward(request, response);
				
			}else {
				stuService.userinsert(userName, passWord1);
				response.sendRedirect("login.jsp");
			}
			
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
