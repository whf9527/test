package service;

import java.util.List;

import comment.Topic;
import comment.topicbeen;


public interface TopicService {
	

	List<topicbeen> list();
	void userinsert(String userName, String userPsw);
}
