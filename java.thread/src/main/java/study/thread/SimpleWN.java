package study.thread;

public class SimpleWN {
	
	final static Object object =new Object();
	
	public static class T1 extends Thread{
		@Override
		public void run() {
			
			synchronized(object) {
				System.out.println(System.currentTimeMillis()+ "T1 start!");
				try {
					System.out.println(System.currentTimeMillis() + "T1 wait for object");
					object.wait();   //wait等待 然后等到notity来唤醒 ,但是notity唤醒也是随机的  并且wait 方法会释放目标对象的锁而下面的sleep方法就不会释放
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println(System.currentTimeMillis() + ": T1 end!");
			}
			
		}
	}
	
	public static class T2 extends Thread{
		@Override
		public void run() {
			synchronized (object) {
				System.out.println(System.currentTimeMillis()+"T2 start ! notity one thread");
				object.notify();
				System.out.println(System.currentTimeMillis()+"T2 end!");
				try {
					Thread.sleep(2000);  //睡眠2秒
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
			
		}
	}
	
	
	public static void main(String[] args) {
		Thread thread1=new T1();
		Thread thread2=new T2();
		thread1.start();
		thread2.start();
	}

}
