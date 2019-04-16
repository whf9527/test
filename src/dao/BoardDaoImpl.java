package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import comment.Board;
import comment.BoardExtend;
import comment.Topic;
import comment.Users;

public class BoardDaoImpl implements BoardDao{

	@Override
	public List<BoardExtend> selectAll(){
		// TODO Auto-generated method stub
		
		
		
		String sql1 = "select \r\n" + 
				"	a.*, b.replyCount\r\n" + 
				"\r\n" + 
				"from (\r\n" + 
				"select topic.boardId, boardName,remark, COUNT(topicId), MAX(postTime) latetime \r\n" + 
				"FROM topic,board\r\n" + 
				"WHERE board.boardId = topic.boardId \r\n" + 
				"GROUP BY boardId\r\n" + 
				") as a\r\n" + 
				"inner join (select topic.boardId, COUNT(replyId) replyCount\r\n" + 
				"\r\n" + 
				"FROM topic,reply\r\n" + 
				"WHERE reply.topicId= topic.topicId \r\n" + 
				"GROUP BY boardId\r\n" + 
				") as b \r\n" + 
				"on a.boardId = b.boardId";
		Object obj1 = Jdbc.executeQuery(sql1,new ResultSetHandler() {
			@Override
			public Object handle(ResultSet rs) throws SQLException {
				List<BoardExtend> list = new ArrayList<>();
				while(rs.next()) {
					BoardExtend emp = new BoardExtend(rs.getInt("COUNT(topicId)"),rs.getDate("latetime"),rs.getInt("replyCount"));
					emp.setBoardId(rs.getInt("boardId"));
					
					emp.setBoardName(rs.getString("boardName"));
					emp.setRemark(rs.getString("remark"));
					list.add(emp);
				}
				return list;
			}
		});
		
		
		List<BoardExtend> list =(List<BoardExtend>)obj1;
		
		
		
		return list;

	}

	@Override
	public void boardInsert(BoardExtend board) {
		// TODO Auto-generated method stub
		
	}
//	public static void main(String[]   args) {
//		BoardDaoImpl b = new BoardDaoImpl();
//		List<BoardExtend> list = b.selectAll();
//		for(BoardExtend a:list) {
//			System.out.println(a.getBoardName()+a.getRemark());
//		}
//	}

}
