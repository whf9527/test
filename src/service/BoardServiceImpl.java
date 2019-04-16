package service;

import java.util.List;

import comment.BoardExtend;
import dao.BoardDao;
import dao.BoardDaoImpl;

public class BoardServiceImpl implements BoardService{

	private BoardDaoImpl boardDao =new BoardDaoImpl();

	@Override
	public List<BoardExtend> getAllBoard() {
		
		// TODO Auto-generated method stub
		return boardDao .selectAll();
	}
//	public static void main(String[] args) {
//		BoardServiceImpl b = new BoardServiceImpl();
//		List<BoardExtend> list = b.getAllBoard();
//		for(BoardExtend a:list) {
//			System.out.println(a.getBoardName()+a.getRemark());
//		}
//	}



	@Override
	public void boardInsert(BoardExtend boardEd) {
		// TODO Auto-generated method stub
		
	}
	
	
}
