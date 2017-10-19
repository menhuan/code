package study.reptile.bean;

import java.util.List;

/**
 * @author dell
 */
public class TemplateInfo {

	public Integer id ;
	
	public String template_type ;
	
	public String template_title ;
	
	public String templaye_title_isSame;

	public List<String> template_cover ;
	
	public List<String> getTemplate_cover() {
		return template_cover;
	}

	public void setTemplate_cover(List<String> template_cover) {
		this.template_cover = template_cover;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTemplate_type() {
		return template_type;
	}

	public void setTemplate_type(String template_type) {
		this.template_type = template_type;
	}

	public String getTemplate_title() {
		return template_title;
	}

	public void setTemplate_title(String template_title) {
		this.template_title = template_title;
	}

	public String getTemplaye_title_isSame() {
		return templaye_title_isSame;
	}

	public void setTemplaye_title_isSame(String templaye_title_isSame) {
		this.templaye_title_isSame = templaye_title_isSame;
	}
	
	
}
