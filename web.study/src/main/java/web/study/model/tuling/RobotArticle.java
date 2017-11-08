package web.study.model.tuling;

/**
 * 新闻类型的文章
 * @author dell
 *
 */
public class RobotArticle {

	/**
	 * 文章标题
	 */
	private String article ;
	
	/**
	 * 文章来源
	 */
	private String source ;
	
	/**
	 * 图标连接
	 */
	private String icon ;
	
	/**
	 * 详细文章连接
	 */
	private String detailurl ;

	public String getArticle() {
		return article;
	}

	public void setArticle(String article) {
		this.article = article;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getDetailurl() {
		return detailurl;
	}

	public void setDetailurl(String detailurl) {
		this.detailurl = detailurl;
	}
	
}
