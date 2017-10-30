package web.study.model.wechat;

public class LinkMessage extends BaseWeChatMessage{

	/**
	 * 消息标题
	 */
	private String title;
	
	/**
	 * 消息描述
	 */
	private String Description;
	
	
	/**
	 * 消息链接
	 */
	private String url ;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	
}
