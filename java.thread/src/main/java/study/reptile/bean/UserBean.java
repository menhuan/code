package study.reptile.bean;

import java.util.List;

/**
 * 用户bean 实体 猜测
 * @author dell
 *
 */
public class UserBean {

	public String  id ; 
	
	public String name ;
	
	public String avatar_url ;
	
	public String tovc_avatar_url ;
	
	public String introduction ;
	
	public String tovc_bried_intro;
	
	public String tovc_intro ;
	
	public String tovc_title ;
	
	public String tovc_level ;
	
	public String role_id ;
	
	public String title ;
	
	public String department_belong ;
	
	public String qr_code_url ;
	
	public List<Role>   roles;

	public Role  role;
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAvatar_url() {
		return avatar_url;
	}

	public void setAvatar_url(String avatar_url) {
		this.avatar_url = avatar_url;
	}

	public String getTovc_avatar_url() {
		return tovc_avatar_url;
	}

	public void setTovc_avatar_url(String tovc_avatar_url) {
		this.tovc_avatar_url = tovc_avatar_url;
	}

	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public String getTovc_bried_intro() {
		return tovc_bried_intro;
	}

	public void setTovc_bried_intro(String tovc_bried_intro) {
		this.tovc_bried_intro = tovc_bried_intro;
	}

	public String getTovc_intro() {
		return tovc_intro;
	}

	public void setTovc_intro(String tovc_intro) {
		this.tovc_intro = tovc_intro;
	}

	public String getTovc_title() {
		return tovc_title;
	}

	public void setTovc_title(String tovc_title) {
		this.tovc_title = tovc_title;
	}

	public String getTovc_level() {
		return tovc_level;
	}

	public void setTovc_level(String tovc_level) {
		this.tovc_level = tovc_level;
	}

	public String getRole_id() {
		return role_id;
	}

	public void setRole_id(String role_id) {
		this.role_id = role_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDepartment_belong() {
		return department_belong;
	}

	public void setDepartment_belong(String department_belong) {
		this.department_belong = department_belong;
	}

	public String getQr_code_url() {
		return qr_code_url;
	}

	public void setQr_code_url(String qr_code_url) {
		this.qr_code_url = qr_code_url;
	}

	
}
