package study.thread;

import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierDemo {
		
	
	public static class Soldier implements Runnable{
		private String soldier;
		private final  CyclicBarrier cyclic ;
		
		public Soldier( CyclicBarrier cyclic , String soldier) {
			this.cyclic = cyclic ;
			this.soldier = soldier ;
		}
		
		@Override
		public void run() {
			try {
				//等到所有任务的到来
				cyclic.await() ;
				doWork();
				
				//等待所有任务完成
				cyclic.await();
				
			}catch (InterruptedException e) {
				// TODO: handle exception
			}catch (BrokenBarrierException e) {
				// TODO: handle exception
			}
		
		
		}
		
		void doWork(){
			try {
				Thread.sleep(Math.abs(new Random().nextInt()%10_000));
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public static class BarrierRun implements Runnable {
		boolean flag ;
		int  N ;
		public BarrierRun(boolean flag, int n) {
			this.flag = flag;
			N = n;
		} 
		
		@Override
		public void run() {
			if(flag){
				System.out.println("司令 ： 士兵"+ N + "个,任务完成");
			}else{
				System.out.println("司令 ： 士兵"+ N + "个,集合完毕");
			}
			
		}
		
		
	}
	public static void main(String[] args) {
		final int N = 10 ;
		Thread[] allSoldier = new Thread[N];
		boolean flag = false ; 
		CyclicBarrier cyclic =new CyclicBarrier(N, new BarrierRun(flag, N));
		
		//设置屏障点,主要是为了执行这个方法
		System.out.println("集合队伍！");
		
		for(int i = 0 ; i < N ; i++ ){
			System.out.println("士兵 "+ i + " 报道 ");
			allSoldier[i] = new  Thread(new Soldier(cyclic, " 士兵 " + i));
			allSoldier[i].start();
		}
		
	}
}
