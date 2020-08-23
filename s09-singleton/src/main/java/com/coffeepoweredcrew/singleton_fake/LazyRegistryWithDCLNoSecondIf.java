package com.coffeepoweredcrew.singleton_fake;

import com.coffeepoweredcrew.singleton.LazyRegistryWithDCL;

public class LazyRegistryWithDCLNoSecondIf {

	private LazyRegistryWithDCLNoSecondIf() {
		System.out.println("LazyRegistryWithDCLNoSecondIf constructor");
	}
	
	//volatile is important
	//explained in TestVolatile.class
	private static volatile LazyRegistryWithDCLNoSecondIf INSTANCE;
	
	public static LazyRegistryWithDCLNoSecondIf getInstance() {
		if(INSTANCE == null) {
			//second thread must wait a bit
			synchronized (LazyRegistryWithDCL.class) {
					INSTANCE = new LazyRegistryWithDCLNoSecondIf();									
			}
		}
		return INSTANCE;
	}
	
}
