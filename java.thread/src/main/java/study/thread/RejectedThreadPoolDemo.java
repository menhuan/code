package study.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class RejectedThreadPoolDemo {

		public static class MyTask implements Runnable{

			@Override
			public void run() {
				System.out.println(System.currentTimeMillis() + " :Thread ID : " + Thread.currentThread().getId());
				
				try {
					Thread.sleep(100);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
			
			
		}
		public static void main(String[] args) throws Exception {
			MyTask task = new MyTask() ;
			
			ExecutorService es  =new ThreadPoolExecutor(5, 5, 0l, TimeUnit.MICROSECONDS, new LinkedBlockingQueue<>(),
					Executors.defaultThreadFactory(),new RejectedExecutionHandler() {
						
						@Override
						public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
							System.out.println(r.toString() + " is discard ");
						}
					});
			
			for(int i = 0 ; i < 5 ; i++) {
				es.submit(task);
				Thread.sleep(10);
			}
			
	  }
	
}
