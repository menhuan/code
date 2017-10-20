package study.thread;

import java.util.concurrent.locks.LockSupport;

public class LockSupportIntDemo {

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
				if(Thread.interrupted()){
					System.out.println(getName() + "被中断了");
				}
			}
			System.out.println(getName() + "执行结束了");
		}
	}

	public static void main(String[] args) throws Exception {
		t1.start();
		Thread.sleep(100);
		t2.start();
		t1.interrupt();
		LockSupport.unpark(t2);
	}
}
