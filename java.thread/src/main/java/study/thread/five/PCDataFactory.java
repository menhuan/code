package study.thread.five;

import com.lmax.disruptor.EventFactory;

public class PCDataFactory implements EventFactory<PCdataTwo> {

	@Override
	public PCdataTwo newInstance() {
		return new PCdataTwo();
	}

}
