package study.thread;

/**
 * 守护线程
 * @author ASUS
 * 创建时间  2017年9月17日 下午11:05:28
 *
 */
public class DaemonDemo {

	
	
	
	public static class DaemonT extends Thread {
		@Override
		public void run() {
			while(true) {
				System.out.println("I am alive");
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		}
		
	}

	public static void main(String[] args) {
		Thread thread= new DaemonT();
		thread.setDaemon(true);  //设置为守护线程
		thread.start();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
