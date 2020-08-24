package com.coffeepoweredcrew.objectpool;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.function.Supplier;

public class ObjectPool<T extends Poolable> {

	private BlockingQueue<T> avaiblePool;

	public ObjectPool(Supplier<T> creator, int count){
		avaiblePool = new LinkedBlockingQueue<>();
		for (int i = 0; i < count; i++) {
			avaiblePool.offer(creator.get());
		}
	}
	
	public T get() {
		try {
			return avaiblePool.take();
		} catch( InterruptedException ex) {
			System.out.println("taken() was interrupted.");
		}
		return null;
	}
	
	public void releases(T obj) {
		obj.reset();
		try {
			avaiblePool.put(obj);
		} catch (InterruptedException e) {
			System.err.println("put was interrupted...");
		}
	}
	
	public int available() {
		return avaiblePool.size();
	}
}
