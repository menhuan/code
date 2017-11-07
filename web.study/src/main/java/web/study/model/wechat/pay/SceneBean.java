package web.study.model.wechat.pay;

/**
 * 尝尽信息bean
 * @author dell
 *
 */
public class SceneBean {

	/**
	 * 门店唯一标识
	 */
	private String id ;
	
	/**
	 * 门店唯一标识
	 */
	private String name ;
	
	/**
	 * 门店行政区划码
	 */
	private String area_code ;

	/**
	 * 门店详细地址
	 */
	private String address ;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getArea_code() {
		return area_code;
	}

	public void setArea_code(String area_code) {
		this.area_code = area_code;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
}
