package study.reptile.bean;

import java.util.Date;
import java.util.List;

/**
 * 存储值
 * @author dell
 *
 */
public class abTestValue {

	public String id ;
	
	public String name ;
	
	public String traffic ;
	
	public String is_del;
	
	public Date create_time ;
	
	public String is_mobile ;
	
	public String alias ;
	
	public String ver ;
	
	public String bucket ;
	
	public List<HitBean>  list;

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

	public String getTraffic() {
		return traffic;
	}

	public void setTraffic(String traffic) {
		this.traffic = traffic;
	}

	public String getIs_del() {
		return is_del;
	}

	public void setIs_del(String is_del) {
		this.is_del = is_del;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public String getIs_mobile() {
		return is_mobile;
	}

	public void setIs_mobile(String is_mobile) {
		this.is_mobile = is_mobile;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getVer() {
		return ver;
	}

	public void setVer(String ver) {
		this.ver = ver;
	}

	public String getBucket() {
		return bucket;
	}

	public void setBucket(String bucket) {
		this.bucket = bucket;
	}

	public List<HitBean> getList() {
		return list;
	}

	public void setList(List<HitBean> list) {
		this.list = list;
	} 
	
	
}
