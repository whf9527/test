package dao;

import java.util.List;

import comment.Topic;
import comment.topicbeen;


public interface TopicDao {
	
	public List<topicbeen> selectAll();
	
	void topicInsert(topicbeen topic);
}
