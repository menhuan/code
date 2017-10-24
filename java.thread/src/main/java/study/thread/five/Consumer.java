package study.thread.five;

import java.text.MessageFormat;
import java.util.Random;
import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {

	private BlockingQueue<PCdata> queue ;
	private static final int SLEEPTIME = 1000 ;
	
	
	public Consumer(BlockingQueue<PCdata> queue) {
		super();
		this.queue = queue;
	}



	@Override
	public void run() {
		System.out.println("start Consumer id = "+ Thread.currentThread().getId());
		Random random = new  Random() ;
		
		try {
			while(true){
				PCdata  data = queue.take() ; // 会阻塞 如果没有结果的话
				if( null != data){
					int re = data.getIntData() * data.getIntData();
					System.out.println(MessageFormat.format("{0} * {1} ={2}",data.getIntData(), 
							data.getIntData(),re));
					Thread.sleep(random.nextInt(SLEEPTIME));
					
				}
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
			Thread.currentThread().interrupt();
		}
	}

}
