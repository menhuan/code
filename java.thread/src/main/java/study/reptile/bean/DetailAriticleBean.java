package study.reptile.bean;

import java.util.List;

/**
 * 从36上爬出来的文章bean
 * @author dell
 *
 */
public class DetailAriticleBean {
  
	/**
	 * id
	 */
	public String id ;
	
	public String project_id ;
	
	public String domain_id ;
	
	public String column_id ;
	
	public String monographic_id ;
	
	public String related_company_id ;
	
	public String related_company_type;
	
	public String related_compant_name ;
	
	public String close_commnet ;
	
	/**
	 * 文章标题
	 */
	public String title ;
	
	public String catch_title;
	
	public String summart;
	
	/**
	 *  文章的具体内容
	 */
	public String content ;
	
	public String cover ;
	
	public String source_urls;
	
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
	public String extra;
	
	public String user_id ;
	
	/**
	 * 猜测 创建时间
	 */
	public String created_at;
	
	/**
	 * 猜测 发布时间
	 */
	public String published_at;
	
	/**
	 * 猜测 更新时间
	 */
	public String update_at ;
	
	/**
	 * 数据bean
	 */
	public Counters  counters;
	
	public String related_company_counters; 
	
	public List<RelatedPosts>  relatedPosts;
	
	public String is_free ;
	
	public String has_rights_goods;
	
	public String is_tovs;
	
	// public String image_source ;  不知道这个格式该写成什么
	
	public String compant_info ;
	
	public String company_info ;
	
	public String company_contact_info;
	
	public String company_fund_info;
	
	public ShareData share_data ;
	
	public String title_mobile ;
	
	public String cover_mobile;
	
	//public String audios ;  //这个暂时不知道应该用什么类型存储
	
	public ColumnBean  column; 
	
	public List<DBCounters>  dbCounters;
	
	public UserBean  user  ;
	
	public List<Role> rolse;
	
	public Role role ;
	
	/**
	 * 可能是别的格式 需要注意
	 */
	public String extraction_tags_extend ;
	
	public String has_rights_research_report;
	
	public List<InternalLinks> internal_links;
	
	/**
	 * 可能是数组
	 */
	public String internal_links_description;

	public void addRoles(Role role){
		rolse.add(role);
	}
	public void addDBCounters(DBCounters bean){
		dbCounters.add(bean);
	}
	
	public void addRelatedPosts(RelatedPosts bean){
		relatedPosts.add(bean);
	}
	
	public void addInternalLinks(InternalLinks bean){
		internal_links.add(bean);
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getProject_id() {
		return project_id;
	}

	public void setProject_id(String project_id) {
		this.project_id = project_id;
	}

	public String getDomain_id() {
		return domain_id;
	}

	public void setDomain_id(String domain_id) {
		this.domain_id = domain_id;
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

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getCover() {
		return cover;
	}

	public void setCover(String cover) {
		this.cover = cover;
	}

	public String getSource_urls() {
		return source_urls;
	}

	public void setSource_urls(String source_urls) {
		this.source_urls = source_urls;
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

	public String getExtra() {
		return extra;
	}

	public void setExtra(String extra) {
		this.extra = extra;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getCreated_at() {
		return created_at;
	}

	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	public String getPublished_at() {
		return published_at;
	}

	public void setPublished_at(String published_at) {
		this.published_at = published_at;
	}

	public String getUpdate_at() {
		return update_at;
	}

	public void setUpdate_at(String update_at) {
		this.update_at = update_at;
	}

	public Counters getCounters() {
		return counters;
	}

	public void setCounters(Counters counters) {
		this.counters = counters;
	}

	public String getRelated_company_counters() {
		return related_company_counters;
	}

	public void setRelated_company_counters(String related_company_counters) {
		this.related_company_counters = related_company_counters;
	}

	public List<RelatedPosts> getRelatedPosts() {
		return relatedPosts;
	}

	public void setRelatedPosts(List<RelatedPosts> relatedPosts) {
		this.relatedPosts = relatedPosts;
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

	public String getCompant_info() {
		return compant_info;
	}

	public void setCompant_info(String compant_info) {
		this.compant_info = compant_info;
	}

	public String getCompany_info() {
		return company_info;
	}

	public void setCompany_info(String company_info) {
		this.company_info = company_info;
	}

	public String getCompany_contact_info() {
		return company_contact_info;
	}

	public void setCompany_contact_info(String company_contact_info) {
		this.company_contact_info = company_contact_info;
	}

	public String getCompany_fund_info() {
		return company_fund_info;
	}

	public void setCompany_fund_info(String company_fund_info) {
		this.company_fund_info = company_fund_info;
	}

	public ShareData getShare_data() {
		return share_data;
	}

	public void setShare_data(ShareData share_data) {
		this.share_data = share_data;
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

	public List<DBCounters> getDbCounters() {
		return dbCounters;
	}

	public void setDbCounters(List<DBCounters> dbCounters) {
		this.dbCounters = dbCounters;
	}

	public UserBean getUser() {
		return user;
	}

	public void setUser(UserBean user) {
		this.user = user;
	}

	public List<Role> getRolse() {
		return rolse;
	}

	public void setRolse(List<Role> rolse) {
		this.rolse = rolse;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public String getExtraction_tags_extend() {
		return extraction_tags_extend;
	}

	public void setExtraction_tags_extend(String extraction_tags_extend) {
		this.extraction_tags_extend = extraction_tags_extend;
	}

	public String getHas_rights_research_report() {
		return has_rights_research_report;
	}

	public void setHas_rights_research_report(String has_rights_research_report) {
		this.has_rights_research_report = has_rights_research_report;
	}

	public List<InternalLinks> getInternal_links() {
		return internal_links;
	}

	public void setInternal_links(List<InternalLinks> internal_links) {
		this.internal_links = internal_links;
	}

	public String getInternal_links_description() {
		return internal_links_description;
	}

	public void setInternal_links_description(String internal_links_description) {
		this.internal_links_description = internal_links_description;
	}
	
	
	
}
