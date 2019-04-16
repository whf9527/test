package comment;

import java.sql.Date;

public class topicbeen {
	private Integer topicId;
	private Integer boardId;
	private String userName;
	private String title;
	private String content;
	private Date postTime;
	public topicbeen() {
		super();
		// TODO Auto-generated constructor stub
	}
	public topicbeen(Integer topicId, Integer boardId, String userName, String title, String content, Date postTime) {
		super();
		this.topicId = topicId;
		this.boardId = boardId;
		this.userName = userName;
		this.title = title;
		this.content = content;
		this.postTime = postTime;
	}
	public Integer getTopicId() {
		return topicId;
	}
	public void setTopicId(Integer topicId) {
		this.topicId = topicId;
	}
	public Integer getBoardId() {
		return boardId;
	}
	public void setBoardId(Integer boardId) {
		this.boardId = boardId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getPostTime() {
		return postTime;
	}
	public void setPostTime(Date postTime) {
		this.postTime = postTime;
	}
	

}
