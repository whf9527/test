package dao;

import java.util.Date;
import java.util.List;

import comment.Reply;
import comment.Users;

public interface issDao {

	List<Reply> selectAll();

	void  topicInsert(int boardId,int userId, String title, String content, Date postTime);	
}
