package web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import comment.BoardExtend;
import comment.Topic;
import comment.topicbeen;
import dao.TopicDao;
import dao.TopicDaoImpl;
import service.BoardServiceImpl;
import service.TopicService;
import service.TopicServiceImpl;

/**
 * Servlet implementation class TopicServlet
 */
@WebServlet("/class161board")
public class TopicServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TopicServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		TopicService topic = new TopicServiceImpl();
		List<topicbeen> list = topic.list();
				

				request.setAttribute("tclass", list);
				int boardid =Integer.parseInt(request.getParameter("boardId")) ;
				request.getSession().setAttribute("boardId", boardid);
//				request.getSession().setAttribute("topicId", request.getParameter("topicId"));
				System.out.println(request.getParameter("boardId"));
				request.getRequestDispatcher("/class161board.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
