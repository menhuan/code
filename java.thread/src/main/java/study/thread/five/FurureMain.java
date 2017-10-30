package study.thread.five;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class FurureMain {

	public static void main(String[] args)  throws Exception{
		//构造任务
		FutureTask<String> future = new FutureTask<String>( new RealDataCall("a"));
		ExecutorService executor =Executors.newFixedThreadPool(1);
		executor.submit(future);
		
		System.out.println("请求完毕");
		try {
			
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println("数据= ： "+ future.get());
	}
	
}
