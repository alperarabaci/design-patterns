package com.coffeepoweredcrew.singleton.test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.coffeepoweredcrew.singleton_fake.LazyRegistryWithDCLNoSecondIf;
import com.coffeepoweredcrew.singleton_fake.LazyRegistryWithDCLWithoutVolatile;

/**
 * Result: Fail!
 * @author alper
 *
 */
public class LazyRegistryWithDCLNoSecondIfParalelTest {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executor = Executors.newFixedThreadPool(Constant.MAX_POOL);

		Callable<Void> callable = new Callable<Void>() {
			public Void call() throws Exception {
				LazyRegistryWithDCLNoSecondIf.getInstance();
				return null;
			}
		};
		
		List<Future<Void>> futures = new ArrayList<>();
		for (int i = 0; i < Constant.MAX_POOL; i++) {
			Future<Void> future = executor.submit(callable);
			futures.add(future);
		}

		for (Future<Void> future : futures) {
			future.get();
		}
		
		
		executor.shutdown();
		while (!executor.isTerminated());
	}
}
