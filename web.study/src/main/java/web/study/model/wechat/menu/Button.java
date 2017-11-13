package web.study.model.wechat.menu;

/**
 * 菜单项的基类
 * @author dell
 *
 */
public class Button {
	
	/**
	 * 菜单的标题
	 */
	private String name ;
	
	/**
	 * 菜单类型 view 表示网页类型
	 */
	private String type ;
	
	/**
	 * click 等点击类型 必须  不超过128字节
	 */
	private String key ;
	
	/**
	 * view  miniprogram 类型必须 不能超过1024字节
	 */
	private String url ;
	
	/**
	 * media_id 和view_limited 类型必须  
	 * 调用新增永久素材借口返回的合法
	 */
	private String media_id ;
	
	/**
	 * 小程序的appid  miniProgram 必须的
	 */
	private String appid ;
	
	/**
	 * 小程序的页面路径
	 */
	private String pagepath ;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getMedia_id() {
		return media_id;
	}

	public void setMedia_id(String media_id) {
		this.media_id = media_id;
	}

	public String getAppid() {
		return appid;
	}

	public void setAppid(String appid) {
		this.appid = appid;
	}

	public String getPagepath() {
		return pagepath;
	}

	public void setPagepath(String pagepath) {
		this.pagepath = pagepath;
	}
	
	
}
