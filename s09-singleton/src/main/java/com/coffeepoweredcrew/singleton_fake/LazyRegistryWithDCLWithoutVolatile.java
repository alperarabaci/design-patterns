package com.coffeepoweredcrew.singleton_fake;

/**
 * This class demonstrates singleton pattern using Double Checked Locking or "classic" singleton.
 * This is also a lazy initializing singleton.
 * Although this implementation solves the multi-threading issue with lazy initialization using volatile
 * and double check locking, the volatile keyword is guaranteed to work only after JVMs starting with
 * version 1.5 and later.
 */
public class LazyRegistryWithDCLWithoutVolatile {

	private LazyRegistryWithDCLWithoutVolatile() {
		System.out.println("LazyRegistryWithDCLWithoutVolatile constructor");
	}
	
	//volatile is important
	//explained in TestVolatile.class
	private static LazyRegistryWithDCLWithoutVolatile INSTANCE;
	
	public static LazyRegistryWithDCLWithoutVolatile getInstance() {
		if(INSTANCE == null) {
			//second thread must wait a bit
			synchronized (LazyRegistryWithDCLWithoutVolatile.class) {
				if(INSTANCE == null) {
					INSTANCE = new LazyRegistryWithDCLWithoutVolatile();									
				}
			}
		}
		return INSTANCE;
	}
 
}
