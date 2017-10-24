package study.thread.five;

public final class PCdata {

	private final int intData ;

	public int getIntData() {
		return intData;
	}

	public PCdata(int intData) {
		super();
		this.intData = intData;
	}
	
	@Override
	public String toString() {
		return "data:"+intData;
	}
	
}
