package web.study.model.wechat;

import java.util.List;

public class NewsMessage extends BaseResMessage {

	private int ArticleCount ;
	
	private List<ArticleResMessage> ariticles;

	public int getArticleCount() {
		return ArticleCount;
	}

	public void setArticleCount(int articleCount) {
		ArticleCount = articleCount;
	}

	public List<ArticleResMessage> getAriticles() {
		return ariticles;
	}

	public void setAriticles(List<ArticleResMessage> ariticles) {
		this.ariticles = ariticles;
	}
	
	
	
	
}
