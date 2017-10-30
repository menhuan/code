package study.thread.five;

import com.lmax.disruptor.WorkHandler;

public class ConsumerTwo implements WorkHandler<PCdataTwo> {

	@Override
	public void onEvent(PCdataTwo event) throws Exception {
		System.out.println(Thread.currentThread().getId() + ":Event: --"
			+event.getValue() * event.getValue() + "--");
		
	}

}
