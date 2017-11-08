package web.study.model.tuling;

/**
 * 图灵机器人API请求bean
 * @author dell
 *
 */
public class RobotRequest {

	/**
	 * 配置的key
	 */
	private String key ;
	
	/**
	 * 请求内容  编码方式为UTF-8
	 */
	private String info ;

	/**
	 * 用户id
	 */
	private String userid;

	/**
	 * 地址信息 请求编码 utf-8
	 */
	private String loc;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}
	
}
