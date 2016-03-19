package oljeet.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorsExample {
	private static final int NTHREDS = 10;

	public static void main(String[] args) throws InterruptedException {
		ExecutorService executor = Executors.newFixedThreadPool(NTHREDS);
		for (int i = 0; i < 500; i++) {
			Runnable worker = new ExecutorsExample.ThreadSaysWhat("Hello " + i);
			executor.execute(worker);
		}
		// This will make the executor accept no new threads
		// and finish all existing threads in the queue
		executor.shutdown();
		// Wait until all threads are finish
		executor.awaitTermination(500, TimeUnit.SECONDS);
		System.out.println("Finished all threads");
	}

	public static class ThreadSaysWhat implements Runnable {

		private String phrase;

		ThreadSaysWhat(String phrase) {
			this.phrase = phrase;
		}

		@Override
		public void run() {
			System.out.println("Thread says what?: " + phrase);
		}
	}
}
