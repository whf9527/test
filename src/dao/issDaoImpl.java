package dao;

import java.util.Date;
import java.util.List;

import comment.Reply;

public class issDaoImpl implements issDao{

	@Override
	public List<Reply> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void topicInsert(int boardId,int userId, String title, String content, Date postTime) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO `topic` (boardId,userId,title,content,postTime) VALUES (?,?,?,?,?)";
		Jdbc.executeUpdate(sql,boardId,userId,title,content,postTime);
		
	}
	

}
