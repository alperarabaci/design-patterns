package com.coffeepoweredcrew.nullobject;

public class Client {

	public static void main(String[] args) {
		ComplexService service = new ComplexService("Simple report",new StorageService());
		service.generateReport();
		
	}

}
