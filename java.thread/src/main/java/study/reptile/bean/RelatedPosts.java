package study.reptile.bean;

import java.util.List;

/**
 * 应该是相关数据bean
 * @author dell
 *
 */
public class RelatedPosts {

	public String id ;
	
	/**
	 * 标题
	 */
	public String title;
	
	public String title_mobile ;
	
	public String cover;
	
	public String cover_mobile;
	
	public String extraction_tags;
	
	public String user_id ;
	
	public String column_id ;
	
	public String publicshed_at ;
	
	public UserBean   user;

	public ColumnBean  column;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle_mobile() {
		return title_mobile;
	}

	public void setTitle_mobile(String title_mobile) {
		this.title_mobile = title_mobile;
	}

	public String getCover() {
		return cover;
	}

	public void setCover(String cover) {
		this.cover = cover;
	}

	public String getCover_mobile() {
		return cover_mobile;
	}

	public void setCover_mobile(String cover_mobile) {
		this.cover_mobile = cover_mobile;
	}

	public String getExtraction_tags() {
		return extraction_tags;
	}

	public void setExtraction_tags(String extraction_tags) {
		this.extraction_tags = extraction_tags;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getColumn_id() {
		return column_id;
	}

	public void setColumn_id(String column_id) {
		this.column_id = column_id;
	}

	public String getPublicshed_at() {
		return publicshed_at;
	}

	public void setPublicshed_at(String publicshed_at) {
		this.publicshed_at = publicshed_at;
	}

	public UserBean getUser() {
		return user;
	}

	public void setUser(UserBean user) {
		this.user = user;
	}

	public ColumnBean getColumn() {
		return column;
	}

	public void setColumn(ColumnBean column) {
		this.column = column;
	}

	
	
}
