package service;

import java.util.List;

import comment.Student;
import comment.Users;



public interface UserService {
//	��ѯ���
	List<Users> list();
//����
	void userinsert(String userName, String userPsw);
}