package web.study.model.wechat;

/**
 * 微信基类消息
 * @author dell
 *
 */
public class BaseWeChatMessage {
	
	/**
	 * 开发者微信号  。。消息发送给谁
	 */
	private String toUserName ;
	
	/**
	 * 发送方的账号 openId  确定之后可以更改熟悉的代码
	 */
	private String FromUserName ;
	
	/**
	 * 消息创建时间
	 */
	private long createTime ;

	/**
	 * 消息类型（text/image /location/link）
	 */
	private String msgType ;

	/**
	 * 消息id  64位整型
	 */
	private long msgId ;

	public String getToUserName() {
		return toUserName;
	}

	public void setToUserName(String toUserName) {
		this.toUserName = toUserName;
	}

	public String getFromUserName() {
		return FromUserName;
	}

	public void setFromUserName(String fromUserName) {
		FromUserName = fromUserName;
	}

	public long getCreateTime() {
		return createTime;
	}

	public void setCreateTime(long createTime) {
		this.createTime = createTime;
	}

	public String getMsgType() {
		return msgType;
	}

	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}

	public long getMsgId() {
		return msgId;
	}

	public void setMsgId(long msgId) {
		this.msgId = msgId;
	}
	
	
}
