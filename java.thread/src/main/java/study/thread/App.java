package study.thread;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	
    	ConcurrentHashMap  hashMap =new ConcurrentHashMap<>();
    	CopyOnWriteArrayList  list ;
    	ConcurrentLinkedQueue  queue;
    	BlockingQueue  queue2;
    	ConcurrentSkipListMap   concurrentSkipListMap;
        System.out.println( "Hello World!" );
    }
}
