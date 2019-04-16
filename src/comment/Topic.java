package comment;

import java.sql.Date;

public class Topic {
	private Integer topicId;
	private Integer boardId;
	private Integer userId;
	private String title;
	private String content;
	private Date postTime;
	public Topic() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Topic(Integer topicId, Integer boardId, Integer userId, String title, String content, Date postTime) {
		super();
		this.topicId = topicId;
		this.boardId = boardId;
		this.userId = userId;
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
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
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
