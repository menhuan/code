package web.study.model.wechat;

/**
 * 自定义菜单事件
 * @author dell
 *
 */
public class MenuEvent extends BaseWeChatEvent {

	private String eventKey;

	public String getEventKey() {
		return eventKey;
	}

	public void setEventKey(String eventKey) {
		this.eventKey = eventKey;
	}
	
	
}
