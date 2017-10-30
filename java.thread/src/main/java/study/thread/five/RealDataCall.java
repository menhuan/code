package study.thread.five;

import java.util.concurrent.Callable;

public class RealDataCall implements Callable<String> {
	private String para ;

	public RealDataCall(String para) {
		super();
		this.para = para;
	}


	@Override
	public String call() throws Exception {
		StringBuffer buffer =new StringBuffer();
		for(int i = 0 ; i < 10 ; i++){
			buffer.append(para+" ");
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				
			}
		}
		return buffer.toString();
	}

}
