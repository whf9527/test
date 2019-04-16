package service;

import java.util.List;

import comment.Topic;
import comment.topicbeen;
import dao.UserDaoImpl;
import dao.TopicDao;
import dao.TopicDaoImpl;
import dao.UserDao;

public class TopicServiceImpl implements TopicService{

	private TopicDao topic = new TopicDaoImpl();
	@Override
	public List<topicbeen> list() {
		// TODO Auto-generated method stub
		return topic.selectAll();
	}

	@Override
	public void userinsert(String userName, String userPsw) {
		// TODO Auto-generated method stub
		
	}

}
