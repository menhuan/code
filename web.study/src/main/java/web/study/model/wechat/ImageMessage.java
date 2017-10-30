package web.study.model.wechat;

/**
 * 图片消息体
 * @author dell
 */
public class ImageMessage extends BaseWeChatMessage {
	
	/**
	 * 图片链接
	 */
	private String picUrl;

	/**
	 * 消息id
	 */
	private String mediaId ;

	public String getPicUrl() {
		return picUrl;
	}

	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	public String getMediaId() {
		return mediaId;
	}

	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
	}


}
