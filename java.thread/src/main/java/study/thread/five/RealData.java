package study.thread.five;

public class RealData implements Data {

	protected  final String result ;
	
	
	public RealData(String result) {
		super();
		StringBuffer buffer =new StringBuffer();
		for(int i = 0 ; i < 10 ; i++){
			buffer.append(result+" ");
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				
			}
		}
		
		this.result = buffer.toString();
	}



	@Override
	public String getResult() {
		return result;
	}

}
