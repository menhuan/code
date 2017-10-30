package study.thread.five;

import java.nio.ByteBuffer;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.lmax.disruptor.BlockingWaitStrategy;
import com.lmax.disruptor.RingBuffer;
import com.lmax.disruptor.dsl.Disruptor;
import com.lmax.disruptor.dsl.ProducerType;

public class CusProMain {
	
	public static void main(String[] args) throws Exception {
		ExecutorService  exector = Executors.newCachedThreadPool() ;
		int bufferSize = 1024 ;
		PCDataFactory  eventFactory = new PCDataFactory() ;
		
		Disruptor<PCdataTwo> disruptor =  new Disruptor<>(eventFactory, 
				bufferSize,
				exector,
				ProducerType.MULTI,
				new BlockingWaitStrategy()
				);
		disruptor.handleEventsWithWorkerPool(
				new ConsumerTwo(),
				new ConsumerTwo(),
				new ConsumerTwo(),
				new ConsumerTwo()
				);

		disruptor.start(); 
		
		RingBuffer<PCdataTwo> ringBuffer = disruptor.getRingBuffer() ;
		ProducerTwo producer = new ProducerTwo(ringBuffer) ;
		ByteBuffer bb =ByteBuffer.allocate(8);
		for(long l = 0 ; true ; l++){
			bb.putLong(0 , l);
			producer.pushDate(bb);
			Thread.sleep(100);
			System.out.println("add Data "+ l);
		}
		
	}

}
