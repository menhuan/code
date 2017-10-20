package study.thread;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorServiceDemo {

	
	public static void main(String[] args) {
		ScheduledExecutorService  service = Executors.newScheduledThreadPool(10);
		service.scheduleAtFixedRate(new Runnable() {
			
			@Override
			public void run() {
				try {
					Thread.sleep(1000);
					System.out.println(System.currentTimeMillis() / 1000);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}, 0, 2, TimeUnit.SECONDS);
		
		
	}
}
