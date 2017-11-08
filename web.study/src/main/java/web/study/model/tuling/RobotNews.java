package web.study.model.tuling;

import java.util.List;

/**
 * 图灵机器人回复 新闻类型的数据
 * @author dell
 *
 */
public class RobotNews extends RobotText {

	private List<RobotArticle>  list ;

	public List<RobotArticle> getList() {
		return list;
	}

	public void setList(List<RobotArticle> list) {
		this.list = list;
	}

}
