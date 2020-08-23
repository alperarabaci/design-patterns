package com.coffeepoweredcrew.singleton;

public class Client {

	public static void main(String[] args) {
		EagerRegistry registry = EagerRegistry.getInstance();
		EagerRegistry registry2 = EagerRegistry.getInstance();
		
		System.out.println(registry == registry2);
		
		LazyRegistryWithDCL l = LazyRegistryWithDCL.getInstance();
		LazyRegistryWithDCL l2 = LazyRegistryWithDCL.getInstance();
		LazyRegistryWithDCL l3 = LazyRegistryWithDCL.getInstance();
		
		System.out.println(l == l2);
		System.out.println(l3 == l2);
		
		System.out.println("?1");
		LazyRegistryIODH singleton1;
		System.out.println("?2");
		LazyRegistryIODH singleton12 = LazyRegistryIODH.getInstance();
		System.out.println("?3");
	}

}
