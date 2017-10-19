package study.reptile.bean;

import java.util.Date;
import java.util.List;

/**
 * 数据bean
 * @author dell
 *
 */
public class HotPostsBean {

	public String id ;
	
	public String goods_id ;
	
	public String column_id ;
	
	public String monographic_id ;
	
	public String related_company_id ;
	
	public String related_company_type;
	
	public String related_compant_name ;
	
	public String total_words;
	
	public String close_commnet ;
	
	/**
	 * 文章标题
	 */
	public String title ;
	
	public String catch_title;
	
	public String summart;
	
	
	public String cover ;
	
	
	/**
	 * 格式是字符串  里面看着像是 数组  以后可能会改造成list或者数组 
	 */
	public String related_post_ids;
	
	/**
	 * 同上
	 */
	public String extraction_tags;
	/**
	 * 这个看着像 map类型数据 如果后期修改的话 可能改成Map 
	 */
	
	public String user_id ;
	
	/**
	 * 猜测 创建时间
	 */
	public Date created_at;
	
	/**
	 * 猜测 发布时间
	 */
	public Date published_at;
	
	/**
	 * 猜测 更新时间
	 */
	public Date update_at ;
	
	/**
	 * 数据bean
	 */
	public Counters  counters;
	
	public String related_posts;
	
	
	public String is_free ;
	
	public String has_rights_goods;
	
	public String is_tovs;
	
	public List<TemplateInfo> template_info;
	
	public String entity_flag ;
	
	public String title_mobile ;
	
	public String cover_mobile;
	
	public ColumnBean  column; 
	
	public List<DBCounters>  db_counters;
	
	public UserBean  user  ;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getGoods_id() {
		return goods_id;
	}

	public void setGoods_id(String goods_id) {
		this.goods_id = goods_id;
	}

	public String getColumn_id() {
		return column_id;
	}

	public void setColumn_id(String column_id) {
		this.column_id = column_id;
	}

	public String getMonographic_id() {
		return monographic_id;
	}

	public void setMonographic_id(String monographic_id) {
		this.monographic_id = monographic_id;
	}

	public String getRelated_company_id() {
		return related_company_id;
	}

	public void setRelated_company_id(String related_company_id) {
		this.related_company_id = related_company_id;
	}

	public String getRelated_company_type() {
		return related_company_type;
	}

	public void setRelated_company_type(String related_company_type) {
		this.related_company_type = related_company_type;
	}

	public String getRelated_compant_name() {
		return related_compant_name;
	}

	public void setRelated_compant_name(String related_compant_name) {
		this.related_compant_name = related_compant_name;
	}

	public String getTotal_words() {
		return total_words;
	}

	public void setTotal_words(String total_words) {
		this.total_words = total_words;
	}

	public String getClose_commnet() {
		return close_commnet;
	}

	public void setClose_commnet(String close_commnet) {
		this.close_commnet = close_commnet;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCatch_title() {
		return catch_title;
	}

	public void setCatch_title(String catch_title) {
		this.catch_title = catch_title;
	}

	public String getSummart() {
		return summart;
	}

	public void setSummart(String summart) {
		this.summart = summart;
	}

	public String getCover() {
		return cover;
	}

	public void setCover(String cover) {
		this.cover = cover;
	}

	public String getRelated_post_ids() {
		return related_post_ids;
	}

	public void setRelated_post_ids(String related_post_ids) {
		this.related_post_ids = related_post_ids;
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

	public Date getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}

	public Date getPublished_at() {
		return published_at;
	}

	public void setPublished_at(Date published_at) {
		this.published_at = published_at;
	}

	public Date getUpdate_at() {
		return update_at;
	}

	public void setUpdate_at(Date update_at) {
		this.update_at = update_at;
	}

	public Counters getCounters() {
		return counters;
	}

	public void setCounters(Counters counters) {
		this.counters = counters;
	}

	public String getRelated_posts() {
		return related_posts;
	}

	public void setRelated_posts(String related_posts) {
		this.related_posts = related_posts;
	}

	public String getIs_free() {
		return is_free;
	}

	public void setIs_free(String is_free) {
		this.is_free = is_free;
	}

	public String getHas_rights_goods() {
		return has_rights_goods;
	}

	public void setHas_rights_goods(String has_rights_goods) {
		this.has_rights_goods = has_rights_goods;
	}

	public String getIs_tovs() {
		return is_tovs;
	}

	public void setIs_tovs(String is_tovs) {
		this.is_tovs = is_tovs;
	}

	public List<TemplateInfo> getTemplate_info() {
		return template_info;
	}

	public void setTemplate_info(List<TemplateInfo> template_info) {
		this.template_info = template_info;
	}

	public String getEntity_flag() {
		return entity_flag;
	}

	public void setEntity_flag(String entity_flag) {
		this.entity_flag = entity_flag;
	}

	public String getTitle_mobile() {
		return title_mobile;
	}

	public void setTitle_mobile(String title_mobile) {
		this.title_mobile = title_mobile;
	}

	public String getCover_mobile() {
		return cover_mobile;
	}

	public void setCover_mobile(String cover_mobile) {
		this.cover_mobile = cover_mobile;
	}

	public ColumnBean getColumn() {
		return column;
	}

	public void setColumn(ColumnBean column) {
		this.column = column;
	}

	public List<DBCounters> getDb_counters() {
		return db_counters;
	}

	public void setDb_counters(List<DBCounters> db_counters) {
		this.db_counters = db_counters;
	}

	public UserBean getUser() {
		return user;
	}

	public void setUser(UserBean user) {
		this.user = user;
	}
	
}
