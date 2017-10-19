package study.reptile.bean;

import java.util.List;

public class BossJobBean {

	public String id ;
	
	public Company company ;
	
	public Boss boss;
	
	public Job job ;
	
	public List<Job> jobs ;
	
	public List<RelatedPosts>  relatedPosts;

	public void addJob(Job job ){
		jobs.add(job);
	}
	
	public void addRelatedPosts(RelatedPosts bean){
		relatedPosts.add(bean);
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public Boss getBoss() {
		return boss;
	}

	public void setBoss(Boss boss) {
		this.boss = boss;
	}

	public Job getJob() {
		return job;
	}

	public void setJob(Job job) {
		this.job = job;
	}

	public List<Job> getJobs() {
		return jobs;
	}

	public void setJobs(List<Job> jobs) {
		this.jobs = jobs;
	}

	public List<RelatedPosts> getRelatedPosts() {
		return relatedPosts;
	}

	public void setRelatedPosts(List<RelatedPosts> relatedPosts) {
		this.relatedPosts = relatedPosts;
	}
	
}
