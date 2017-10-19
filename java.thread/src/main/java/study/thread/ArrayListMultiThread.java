package study.thread;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 并发下的Arraylist问题
 * @author ASUS
 * 创建时间  2017年9月19日 下午11:21:03
 *
 */
public class ArrayListMultiThread {

	static ArrayList<Integer> al=new ArrayList<Integer>(10); 
	public static class AddThread implements Runnable{
		public void run() {
			for(int i= 0; i<1000000; i++) {
				al.add(i);
			}
			
		}
	}
	
	public static void main(String[] args) throws Exception {
		Thread t1 =new Thread(new AddThread());
		Thread t2 =new Thread(new AddThread());
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(al.size());
	}
}
