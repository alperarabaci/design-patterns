package com.company.singleresp;

public class UserPersistenceService {

	 private Store store = new Store();
	 
	 void save(User user){
		 store.store(user);
	 }
	
}
