package web.study.model.wechat;

/**
 * 上报地理位置事件
 * @author dell
 *
 */
public class LocationEvent extends BaseWeChatEvent {

	private String Latitude ;
	
	private String Longitude ;
	
	private String precision;

	public String getLatitude() {
		return Latitude;
	}

	public void setLatitude(String latitude) {
		Latitude = latitude;
	}

	public String getLongitude() {
		return Longitude;
	}

	public void setLongitude(String longitude) {
		Longitude = longitude;
	}

	public String getPrecision() {
		return precision;
	}

	public void setPrecision(String precision) {
		this.precision = precision;
	}
	
	
}
