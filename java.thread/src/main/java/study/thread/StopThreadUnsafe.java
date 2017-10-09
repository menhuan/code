package study.thread;

/**
 * 联系
 * @author ASUS
 * 创建时间  2017年9月6日 下午11:00:42
 *
 */
public class StopThreadUnsafe {

	public static User user=new User();
	public static class User{
		private int id ;
		
		private String name;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public User() {
			id=0;
			name="0";
		}
		
		public User(int id, String name) {
			this.id = id;
			this.name = name;
		}
		@Override
		public String toString() {
			return "User [id="+id+", name="+name+ "]";
		}
		
	}
	
	public static class ChangeObjectThread extends Thread{
		
		volatile boolean stopme=false;
		
		public void stopMe() {
			stopme=true;
		}
		
		@Override
		public void run() {
			
			while(true) {
				if(stopme) {
					System.out.println("exit by stop me");
					break;
				}
				
				synchronized (user) {
					int v=(int)  System.currentTimeMillis()/1000;
					user.setId(v);
					
					try {
						Thread.sleep(100);
						
					} catch (Exception e) {
						e.printStackTrace();
					}
					
					user.setName(String.valueOf(v));
				}
				Thread.yield();  //相当于睡眠，不过 只是 让同优先级别的线程有执行的机会 。  并且不能指定 暂停多长时间
			}
			
		}
	}
	
	
	public static class ReadObjectThread extends Thread{
		@Override
		public void run() {
			while(true) {
				synchronized (user) {
					if(user.getId()!=Integer.parseInt(user.getName())) {
						System.out.println(user.toString());
					}
				}
				Thread.yield();
			}
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		new ReadObjectThread().start();
		while(true) {
			Thread thread=new ChangeObjectThread();
			thread.start();
			Thread.sleep(150);
			thread.stop();
		}
	}
	
}
