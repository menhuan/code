package study.reptile.bean;

import java.util.List;

public class HotPosts {

	public List<HotPostsBean>  list;
	
	public void addHotPostsBean(HotPostsBean bean){
		list.add(bean);
	}
	
	public List getList() {
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}
	
}
