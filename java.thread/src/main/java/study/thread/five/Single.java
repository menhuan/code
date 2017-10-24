package study.thread.five;

public class Single {

	public static int STATUS = 1 ;
	private Single(){
		System.out.println("Single  is  create");
	}
	
//	private static Single single =new Single() ;
	private static Single single = null ;
	
//	public static Single getInstance(){
//		if(single == null)
//			 single = new Single() ;
//		
//		return single ;
//	}
	
	
	private static class SingleTonHolder{
		private static Single  instance = new  Single();
	}
	public static Single getInstance(){
		return  SingleTonHolder.instance ;
	}
	
}
