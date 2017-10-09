package study.thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class SemapDemo implements Runnable {

	
	final Semaphore semp =new Semaphore(5);
	
	public void run() {
		try {
			semp.acquire();
			Thread.sleep(2000);
			System.out.println(Thread.currentThread().getId() + ":done!");
			semp.release();
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

	public static void main(String[] args) {
		ExecutorService  executionn= Executors.newFixedThreadPool(20);
		final SemapDemo demo =new SemapDemo();
		for(int i=0;i<20;i++) {
			executionn.submit(demo);
		}
	}
}
