package com.coffeepoweredcrew.singleton.test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.coffeepoweredcrew.singleton_fake.LazyRegistryWithDCLWithoutVolatile;

/**
 * Result: not fail without volatile with my eclipse heap size (Constant.MAX_POOL:4048)+ machine:
 * Processor Name:	Intel Core i7
   Processor Speed:	2,3 GHz
   Number of Processors:	1
   Total Number of Cores:	4
 * Check this:
 * https://stackoverflow.com/questions/11639746/what-is-the-point-of-making-the-singleton-instance-volatile-while-using-double-l
 * http://www.cs.umd.edu/~pugh/java/memoryModel/DoubleCheckedLocking.html
 * @author alper
 *
 */
public class LazyRegistryWithDCLWithoutVolatileParalelTest {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executor = Executors.newFixedThreadPool(Constant.MAX_POOL);
		
		Callable<Void> callable = new Callable<Void>() {
			public Void call() throws Exception {
				LazyRegistryWithDCLWithoutVolatile.getInstance();
				return null;
			}
		};

		//List<Future<Void>> futures = new ArrayList<>();
		for (int i = 0; i < Constant.MAX_POOL; i++) {
			executor.submit(callable);
			//Future<Void> future = executor.submit(callable);
			//futures.add(future);
		}

		/*
		for (Future<Void> future : futures) {
			future.get();
		}
		*/
		
		
		executor.shutdown();
		while (!executor.isTerminated());
	}
}
