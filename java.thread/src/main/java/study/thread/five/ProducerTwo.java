package study.thread.five;

import java.nio.ByteBuffer;

import com.lmax.disruptor.RingBuffer;

/**
 * 生产者
 * @author dell
 */
public class ProducerTwo {

	private final RingBuffer<PCdataTwo> ringBuffer ;
	
	public ProducerTwo(RingBuffer<PCdataTwo> ringBuffer){
		this.ringBuffer = ringBuffer ;
	}
	
	
	public void pushDate (ByteBuffer bb){
		long sequence = ringBuffer.next();  
		
		try {
			PCdataTwo event = ringBuffer.get(sequence);
			
			event.setValue(bb.getLong());
		} catch (Exception e) {
			
		}finally{
			
			ringBuffer.publish(sequence);
		}
	}
	
}
