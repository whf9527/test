package comment;

import java.sql.Timestamp;

public class Reply {
	private Integer replyId;
	private Integer userId;
	private Integer topicId;
	private String content;
	private Timestamp replyTime;
	public Reply() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Reply(Integer replyId, Integer userId, Integer topicId, String content, Timestamp replyTime) {
		super();
		this.replyId = replyId;
		this.userId = userId;
		this.topicId = topicId;
		this.content = content;
		this.replyTime = replyTime;
	}
	public Integer getReplyId() {
		return replyId;
	}
	public void setReplyId(Integer replyId) {
		this.replyId = replyId;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getTopicId() {
		return topicId;
	}
	public void setTopicId(Integer topicId) {
		this.topicId = topicId;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Timestamp getReplyTime() {
		return replyTime;
	}
	public void setReplyTime(Timestamp replyTime) {
		this.replyTime = replyTime;
	}
	
}
