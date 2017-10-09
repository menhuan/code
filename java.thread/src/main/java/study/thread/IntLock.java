package study.thread;

import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Logger;

public class IntLock implements Runnable {

	private static final Logger LOGGER  =Logger.getLogger("IntLock");
	public static ReentrantLock  lock1 =new ReentrantLock();
	public static ReentrantLock  lock2 =new ReentrantLock();
	int lock;
	public void run() {

		try {
			if(lock == 1 ) {
				lock1.lockInterruptibly();
				try {
					Thread.sleep(1000);
					
				} catch (Exception e) {
					LOGGER.info("打印日志"+lock1.toString());
					lock2.lockInterruptibly();
				}
			}else {
				lock2.lockInterruptibly();
				
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					LOGGER.info("打印日志"+lock2.toString());
					lock1.lockInterruptibly();
				}
			}
			
			
		} catch (Exception e) {
			LOGGER.info("都出现错误");
			e.printStackTrace();
		}finally {
			if(lock1.isHeldByCurrentThread()) {
				lock1.unlock();
			}
			if (lock2.isHeldByCurrentThread()) {
				lock2.unlock();
			}
			System.out.println(Thread.currentThread().getId()+":线程退出");
		}
	}
	
	public static void main(String[] args) throws Exception {
		IntLock  re= new IntLock(1);
		IntLock  re2= new IntLock(2);
		
		Thread t1= new Thread(re);
		Thread t2= new Thread(re2);
		t1.start();t2.start();
		Thread.sleep(1000);
		t2.interrupt();
	}
	

	
	public IntLock(int lock) {
		this.lock=lock;
	}
}
