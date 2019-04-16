package web;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import comment.Student;
import comment.Users;
import service.UserService;
import service.UserServiceImpl;

/**
 * Servlet implementation class loginServlet
 */
@WebServlet("/login")
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginServlet() {
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
		String passWord = request.getParameter("password");
		
		UserService stuService = new UserServiceImpl();
		List<Users> list = stuService.list();
		
//		System.out.println(list.size());
		int flag = 0;
		if ( !"".equals(userName) && !"".equals(passWord))
		{
			for (Users user: list) {
				if(user.getUserName().equals(userName) && user.getUserPwd().equals(passWord)) {
//					System.out.println("---------------------------AuthenticationFilter");
					flag = 1;
					break;
				}	
			}
			if(1 == flag) {
				request.getSession().setAttribute("username", userName);

				for (Users user: list) {
					if(user.getUserName().equals(userName) ) {
						request.getSession().setAttribute("userId", user.getUserId());
						System.out.println(user.getUserId());
						break;
					}	
				}
				response.sendRedirect("index");
				
			}
			else {
				request.setAttribute("tip", "UserName or PassWord error!");
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}
		}
		else if("".equals(userName) && !"".equals(passWord)) {
			request.setAttribute("tip", "name is null");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
		else if(!"".equals(userName) && "".equals(passWord)) {
			request.setAttribute("tip", "passWord is null");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
		else if("".equals(userName) && "".equals(passWord)) {
			request.setAttribute("tip", "userName and passWord are null");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
