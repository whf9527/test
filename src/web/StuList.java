package web;

import java.io.IOException;
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


/*
 * ����Դֻ���ɺϷ��û�(�ѵ�¼�����û�)����
 */
@WebServlet("/StuList")

public class StuList extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private UserService stuService = new UserServiceImpl();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws  ServletException, IOException {
		List<Users> list = stuService.list();		
		request.setAttribute("stus", list);


		
		request.getRequestDispatcher("/Student.jsp").forward(request, response);
	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
		
}
	
