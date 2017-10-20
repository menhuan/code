package study.thread;

import java.util.concurrent.locks.LockSupport;

import study.thread.LockSupportIntDemo.ChangeObjectThread;

public class LockSupportDemo {

	public static Object U = new Object() ;
	static ChangeObjectThread t1 = new ChangeObjectThread("t1");
	static ChangeObjectThread t2 = new ChangeObjectThread("t2");
	public static class ChangeObjectThread extends Thread{
		public ChangeObjectThread (String name){
			super.setName(name);
		}
		
		@Override
		public void run() {
			synchronized(U){
				System.out.println("in " + getName());
				LockSupport.park();
				
			}
		}
	}
	
	public static void main(String[] args) throws Exception {
		t1.start();
		Thread.sleep(100);
		t2.start();
		LockSupport.unpark(t1);
		LockSupport.unpark(t2);
		t1.join();
		t2.join();
	}
}
