package com.coffeepoweredcrew.singleton;

/**
 * I would highly recommend to stick with the lazy initialization holder because this pattern provides you best of both worlds.
 * 
 * Singleton pattern using lazy initialization holder class. This ensures that, we have a lazy initialization
 * without worrying about synchronization.
 */
public class LazyRegistryIODH {
	
	private LazyRegistryIODH() {
		System.out.println("LazyRegistryIODH constructor");
	}
	
	private static class RegistryHolder {
		static LazyRegistryIODH INSTANCE = new LazyRegistryIODH();
	}

	/**
	 * serefsizim aklima geldiydi, ama hic boyle kullanim gormediydim.
	 * RegistryHolder bunu durtukleyebilecek bir yapi yok cunku.
	 * Sadece getInstance uzerinden erisim var. O erisimde 
	 * calisacak bu INSTANCE olusturma.
	 * @return
	 */
	public static LazyRegistryIODH getInstance() {
		return RegistryHolder.INSTANCE;
	}
}
