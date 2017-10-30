package web.study.model.wechat;

/**
 * 地理位置消息接口
 * @author dell
 *
 */
public class LocationMessage extends BaseWeChatMessage {

	/**
	 * 地理位置维度
	 */
	private String LocationX;
	
	private String LocationY;
	
	/**
	 * 地理缩放大小
	 */
	private String scale;
	
	/**
	 * 地理位置信息
	 */
	private String label ;

	public String getLocationX() {
		return LocationX;
	}

	public void setLocationX(String locationX) {
		LocationX = locationX;
	}

	public String getLocationY() {
		return LocationY;
	}

	public void setLocationY(String locationY) {
		LocationY = locationY;
	}

	public String getScale() {
		return scale;
	}

	public void setScale(String scale) {
		this.scale = scale;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}
	
	
}
