package study.thread;

import java.util.ArrayList;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

/**
 * 
 * @author ASUS
 * 创建时间  2017年10月21日 下午2:38:33
 *
 */
public class CountTask extends RecursiveTask<Long> {

	private static final int THRESHOLD = 10_000 ;
	
	private long start ;

	private long end ;
	
	
	public CountTask(long start, long end) {
		super();
		this.start = start;
		this.end = end;
	}


	@Override
	protected Long compute() {
	
		long sum = 0 ;
		boolean canCompute = (end - start ) <THRESHOLD ;
		
		if(canCompute) {
			for(long i = start ; i <= end ;i++ ) {
				sum +=i;
			}
		}else {
			//分成多个任务
			long step = (start + end ) /100;
			ArrayList<CountTask> subTasks = new ArrayList<CountTask>();
			long pos = start ;
			int index = 100;
			for ( int i = 0 ; i < index ; i++) {
				long  lastOne = pos + step ;
				if(lastOne > end ) {
					lastOne = end;
				}
				
				CountTask subTask = new CountTask(pos, lastOne);
				pos += step+1 ;
				subTasks.add(subTask);
				subTask.fork();//提交子任务用来
			}
			
			for (CountTask countTask : subTasks) {
					sum += countTask.join();
				
			}
		}
		
		return sum ;
	}

	
	public static void main(String[] args) {
		ForkJoinPool forkJoinPool = new ForkJoinPool() ;
		
		CountTask  task = new CountTask(0, 200_000l);
		
		ForkJoinTask<Long> result = forkJoinPool.submit(task);
		try {
			long res = result.get();
			System.out.println(" sum= "+res);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
