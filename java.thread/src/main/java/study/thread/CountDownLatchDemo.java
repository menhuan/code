package study.thread;

import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class CountDownLatchDemo implements Runnable {

	static final CountDownLatch end = new  CountDownLatch(10);
	static final CountDownLatchDemo  demo = new CountDownLatchDemo();
	
	
	@Override
	public void run() {
		
		try {
			
			//模拟检查任务 
			Thread.sleep(new Random().nextInt(10)*1000);
			System.out.println("check complete");
			end.countDown();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) throws Exception {
		ExecutorService exec = new  ThreadPoolExecutor(10, 10,
				  0L, TimeUnit.MILLISECONDS,
			        new LinkedBlockingQueue<Runnable>());
		for(int i = 0 ; i < 10 ; i++){
			exec.submit(demo);
		}
		
		//等待检查
		end.await();
		
		// 发射  相当于开始执行任务
		System.out.println("fire");
		
		exec.shutdown();
	}
}
