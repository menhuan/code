package study.thread;

import java.util.HashMap;
import java.util.Map;

public class JoinMain {

	/**
	 * volatile  变量的可见性 不可代替锁
	 */
	private volatile static int i=0;
	
	public static class AddThread extends Thread{
		@Override
		public void run() {
			for(i=0;i<10000000;i++){
				
			}	;
		}
	}
	
	public static void main(String[] args) throws Exception {
		AddThread thread= new AddThread();
		thread.start();
	//	thread.join();
		System.out.println(i);
	
		Map  map =new HashMap();
		map.put("", "");
	}
	
}
