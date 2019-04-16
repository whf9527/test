package web;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import comment.Topic;
import comment.Users;
import dao.issDaoImpl;
import service.UserService;
import service.UserServiceImpl;

/**
 * Servlet implementation class replyServlet
 */
@WebServlet("/isstopic")
public class isstopicServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public isstopicServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		System.out.println(title);
		System.out.println(content);
		
		
		if ( !"".equals(title) && !"".equals(content)){
			issDaoImpl iss = new issDaoImpl();
			HttpServletRequest req = (HttpServletRequest) request;
			HttpServletResponse resp = (HttpServletResponse) response;
			HttpSession session = req.getSession();
			int userId = (int) session.getAttribute("userId");
			System.out.println(userId);
			int boardId = (int) session.getAttribute("boardId");
			System.out.println(boardId);
	 		Date postTime = new Date();
	 		iss.topicInsert(boardId,userId,title,content,postTime);
	 		response.sendRedirect("index");
		}
		else if("".equals(title) && !"".equals(content)) {
			request.setAttribute("tip", "title is null");
			request.getRequestDispatcher("isstopic.jsp").forward(request, response);
		}
		else if(!"".equals(title) && "".equals(content)) {
			request.setAttribute("tip", "content is null");
			request.getRequestDispatcher("isstopic.jsp").forward(request, response);
		}
		else if("".equals(title) && "".equals(content)) {
			request.setAttribute("tip", "title and content are null");
			request.getRequestDispatcher("isstopic.jsp").forward(request, response);
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
