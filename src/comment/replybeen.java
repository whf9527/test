package comment;

import java.sql.Date;

public class replybeen {
	private Integer replyId;
	private Integer topicId;
	private String title;
	private String topcontent;
	private Date postTime;
	private String recontent;
	private Date replyTime;
	private String userName;
	public replybeen() {
		super();
		// TODO Auto-generated constructor stub
	}
	public replybeen(Integer replyId, Integer topicId, String title, String topcontent, Date postTime, String recontent,
			Date replyTime, String userName) {
		super();
		this.replyId = replyId;
		this.topicId = topicId;
		this.title = title;
		this.topcontent = topcontent;
		this.postTime = postTime;
		this.recontent = recontent;
		this.replyTime = replyTime;
		this.userName = userName;
	}
	public Integer getReplyId() {
		return replyId;
	}
	public void setReplyId(Integer replyId) {
		this.replyId = replyId;
	}
	public Integer getTopicId() {
		return topicId;
	}
	public void setTopicId(Integer topicId) {
		this.topicId = topicId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTopcontent() {
		return topcontent;
	}
	public void setTopcontent(String topcontent) {
		this.topcontent = topcontent;
	}
	public Date getPostTime() {
		return postTime;
	}
	public void setPostTime(Date postTime) {
		this.postTime = postTime;
	}
	public String getRecontent() {
		return recontent;
	}
	public void setRecontent(String recontent) {
		this.recontent = recontent;
	}
	public Date getReplyTime() {
		return replyTime;
	}
	public void setReplyTime(Date replyTime) {
		this.replyTime = replyTime;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
}
