package study.thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ReenterLockCondition implements Runnable {

	public static ReentrantLock lock =new ReentrantLock();
	
	public static Condition condtionCondition =lock.newCondition();
	public void run() {
			
		try {
			lock.lock();
			condtionCondition.await();
			System.out.println("Thread is going on");
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			lock.unlock();
		}
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		ReenterLockCondition t2=new ReenterLockCondition();
		Thread t1=new Thread(t2);
		t1.start();
		
		Thread.sleep(2000);
		lock.lock();
		condtionCondition.signal();
		lock.unlock();
		
		
	}

}
