package service;

import java.util.List;

import comment.BoardExtend;

public interface BoardService {

	List<BoardExtend> getAllBoard();
	
	public void boardInsert(BoardExtend boardEd);
	
	
}
