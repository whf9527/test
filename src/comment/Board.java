package comment;

public class Board {
	protected Integer boardId;
	protected  String boardName;
	protected String remark;
	

	public Board(Integer boardId, String boardName, String remark) {
		super();
		this.boardId = boardId;
		this.boardName = boardName;
		this.remark = remark;
	}

	public Board() {
		// TODO Auto-generated constructor stub
	}

	public Integer getBoardId() {
		return boardId;
	}

	public void setBoardId(Integer boardId) {
		this.boardId = boardId;
	}

	public String getBoardName() {
		return boardName;
	}

	public void setBoardName(String boardName) {
		this.boardName = boardName;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	
	
	
}
