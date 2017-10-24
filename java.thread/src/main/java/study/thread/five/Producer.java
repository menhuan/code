package study.thread.five;

import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class Producer implements Runnable {

	
	private volatile boolean isRunning = true ;
	private BlockingQueue<PCdata>  queue ;
	private static AtomicInteger count = new AtomicInteger() ; //总数 原子操作类
	private static final int SLEEPTIME = 100 ;
	
	public Producer(BlockingQueue<PCdata> queue) {
		super();
		this.queue = queue;
	}
	
	@Override
	public void run() {
		PCdata data = null ;
		Random  random = new  Random();
		System.out.println(" start produceted id = "+ Thread.currentThread().getId());
		
		try {
			while(isRunning){
				Thread.sleep(random.nextInt(SLEEPTIME));
				data = new PCdata(count.incrementAndGet());   //构造任务数据
				System.out.println(data + "is put into queue");
				if(!queue.offer(data,2,TimeUnit.SECONDS)){
					System.err.println("filed to put data :"+ data);
				}
				
			}
			
			
		} catch (Exception e) {
			e.printStackTrace(); 
			Thread.currentThread().interrupt(); 
		}
			
	}

	public void stop(){
		isRunning = false ;
		
	}
}	
