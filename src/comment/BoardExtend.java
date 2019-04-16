package comment;

import java.util.Date;

//Í³¼Æ
public class BoardExtend extends Board {
	
	private long topicCount;
	private long replyCount;
	private Date lastPostTime;
	

	public BoardExtend(long topicCount, Date lastPostTime, long replyCount) {
		super();
		this.topicCount = topicCount;
		this.replyCount = replyCount;
		this.lastPostTime = lastPostTime;
	}
	public long getTopicCount() {
		return topicCount;
	}
	public void setTopicCount(long topicCount) {
		this.topicCount = topicCount;
	}
	public long getReplyCount() {
		return replyCount;
	}
	public void setReplyCount(long replyCount) {
		this.replyCount = replyCount;
	}
	public Date getLastPostTime() {
		return lastPostTime;
	}
	public void setLastPostTime(Date lastPostTime) {
		this.lastPostTime = lastPostTime;
	}
	
}
