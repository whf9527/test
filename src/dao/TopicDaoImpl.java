package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import comment.Topic;
import comment.Users;
import comment.topicbeen;

public class TopicDaoImpl implements TopicDao{

	@Override
	public List<topicbeen> selectAll() {
		// TODO Auto-generated method stub
		String sql = "select  topicId,topic.boardId,userName,title,content,postTime\r\n" + 
				"FROM topic,`user`\r\n" + 
				"WHERE `user`.userId= topic.userId\r\n" + 
				"GROUP BY topicId\r\n" + 
				"";
		Object obj = Jdbc.executeQuery(sql, new ResultSetHandler() {
			@Override
			public Object handle(ResultSet rs) throws SQLException {
				List<topicbeen> list = new ArrayList<>();
				while(rs.next()) {
					topicbeen emp = new topicbeen(rs.getInt("topicId"),rs.getInt("boardId"),rs.getString("userName"),rs.getString("title"),rs.getString("content"),rs.getDate("postTime"));
					list.add(emp);
				}
				return list;
			}
		});
		return (List<topicbeen>) obj;
	}

	@Override
	public void topicInsert(topicbeen topic) {
		// TODO Auto-generated method stub
//		String sql = "INSERT INTO `topic` (boardId,userId,t,replyTime) VALUES (?,?,?,?)";
//		Jdbc.executeUpdate(sql,topic.boardId,topicId,content,replyTime);
	}
	
}
