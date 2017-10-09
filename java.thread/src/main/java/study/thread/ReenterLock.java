package study.thread;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 重入锁
 * @author ASUS
 * 创建时间  2017年9月27日 上午8:09:01
 *
 */
public class ReenterLock  implements Runnable{

	public static ReentrantLock lookLock= new ReentrantLock();
	
	public static int i=0;
	
	public void run() {
		
		for(int j=0; j<100000;j++) {
			lookLock.lock();
			lookLock.lock();
			try {
				i++;
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				lookLock.unlock();
				lookLock.unlock();
			}
		}
	}

	
	public static void main(String[] args) throws InterruptedException {
		ReenterLock  reenterLock=new ReenterLock();
		Thread t1=new Thread(reenterLock);
		Thread t2=new Thread(reenterLock);
		
		t1.start(); t2.start();
		t1.join();t2.join();
		System.out.println(i);
	
	}
}
