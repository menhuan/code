package web.study.model.wechat;

/**
 * 扫描带参数的二维码事件
 * @author dell
 */
public class QRCodeEvent extends BaseWeChatEvent {

	/**
	 * 事件Key值
	 */
	private String eventKey;
	
	/**
	 * 用于换取二维码图片
	 */
	private String ticket;

	public String getEventKey() {
		return eventKey;
	}

	public void setEventKey(String eventKey) {
		this.eventKey = eventKey;
	}

	public String getTicket() {
		return ticket;
	}

	public void setTicket(String ticket) {
		this.ticket = ticket;
	}
	
	
	
}
