package study.reptile.bean;

import java.util.List;

public class AbTest {

	public List<abTestValue>  list;

	public void addAbTest(abTestValue value){
		list.add(value);
	}
	
	public List<abTestValue> getList() {
		return list;
	}

	public void setList(List<abTestValue> list) {
		this.list = list;
	}
	
	
	
}
