package study.thread.five;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.LockSupport;

public class HeavySocketClient {

	private static ExecutorService  tp =Executors.newCachedThreadPool();
	
	private static final int sleep_time =1000 * 1000 * 1000 ;
	
	public static class EchoClient implements Runnable{
		@Override
		public void run() {
			Socket client =null ;
			PrintWriter writer = null ;
			BufferedReader reader = null ;
			
			try {
				client =new Socket ();
				client.connect(new InetSocketAddress("localhost", 8000));
				writer = new PrintWriter(client.getOutputStream() , true );
				writer.print("H");
				LockSupport.parkNanos(sleep_time);
				writer.println("e");
				LockSupport.parkNanos(sleep_time);
				writer.println("e");
				
				LockSupport.parkNanos(sleep_time);
				writer.println("e");
				
				LockSupport.parkNanos(sleep_time);
				writer.println("e");
				
				LockSupport.parkNanos(sleep_time);
				writer.println("e");
				
				LockSupport.parkNanos(sleep_time);
				writer.println("e");
				writer.flush();
				
				reader =new BufferedReader(new InputStreamReader(client.getInputStream()));
				System.out.println("from server : " +reader.readLine());
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
	}
	
}
