package web.study.model.wechat;

/**
 * 语音消息实体
 * @author dell
 *
 */
public class VoiceMessage extends BaseWeChatMessage {
	
	/**
	 *  媒体ID
	 */
	private String mediaId;	
	
	/**
	 * 语音格式
	 */
	private String Format ;

	public String getMediaId() {
		return mediaId;
	}

	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
	}

	public String getFormat() {
		return Format;
	}

	public void setFormat(String format) {
		Format = format;
	}
	
	
}
