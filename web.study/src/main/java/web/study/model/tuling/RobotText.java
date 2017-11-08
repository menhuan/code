package web.study.model.tuling;

/**
 * 图灵机器人回复文本信息
 * @author dell
 *
 */
public class RobotText  extends RobotBase{

	/**
	 * 回复的文本内容
	 */
	private String text;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	
}
