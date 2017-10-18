package study.thread;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * 
 * @author ASUS
 * 创建时间  2017年10月12日 下午11:08:06
 *
 */
public class ReadWriteLockDemo {
	private static Lock lock = new ReentrantLock();
	private static ReentrantReadWriteLock readWriteLock = new  ReentrantReadWriteLock();
	
	private static Lock readLock = readWriteLock.readLock();
	private static Lock writeLock =readWriteLock.writeLock();
	
	private int value ;
	
	
	public Object handleRead(Lock lock) throws InterruptedException {
		try {
			lock.lock();
			Thread.sleep(1000);
			return value;
			
		}finally {
			lock.unlock();
		}
	}
	
	public void handleWrite(Lock lock,int index) throws InterruptedException{
		try {
			lock.lock();  //模拟写的操作
			Thread.sleep(1000);
			value=index;
		} finally {
			lock.unlock();
		}
	}
	
	public static void main(String[] args) {
		final ReadWriteLockDemo  demo= new ReadWriteLockDemo();
		Runnable readRunnable =new Runnable() {
			
			public void run() {
				try {
//					demo.handleRead(readLock);
					demo.handleRead(lock);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		};
		
		Runnable writerRunnable =new Runnable() {
			
			public void run() {
				try {
//					demo.handleWrite(writeLock, new Random().nextInt());
					demo.handleWrite(lock, new Random().nextInt());
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		};
		
		for (int i = 18; i < 20; i++) {
			new Thread(writerRunnable).start();
		}
	}
	
}
