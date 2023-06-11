package parallelcomputing;

import java.util.ArrayList;

public class CounterTest {
	public static void main(String args[]) throws InterruptedException {
		CallCounts callCounts = new CallCounts();
		CounterThread ct1 = new CounterThread("Thread A", 0, callCounts);
		CounterThread ct2 = new CounterThread("Thread B", 0, callCounts);
		CounterThread ct3 = new CounterThread("Thread C", 0, callCounts);
		ArrayList<Thread> threads = new ArrayList<Thread>();
		threads.add(ct1);
		threads.add(ct2);
		threads.add(ct3);
		ct1.start();
		ct2.start();
		ct3.start();
		System.out.println("Amount of update calls :"+callCounts.getValue());
		
		for (Thread thread : threads) {
			thread.join();
		}
		System.out.println("Amount of update calls :"+callCounts.getValue());
	}
}



