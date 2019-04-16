package dao;

import java.sql.SQLException;
import java.util.List;

import comment.BoardExtend;

public interface BoardDao {
	
	List<BoardExtend> selectAll();
	
	void boardInsert(BoardExtend board);
}
