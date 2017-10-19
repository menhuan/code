package study.reptile.bean;

import java.util.List;

public class BossJobs {

	public List<BossJobBean>  bean ;

	public void addBossJob(BossJobBean bean){
		this.bean.add(bean);
	}
	
	public List<BossJobBean> getBean() {
		return bean;
	}

	public void setBean(List<BossJobBean> bean) {
		this.bean = bean;
	}

	
	
}

