package com.udemy.factorymethod.ex1.message;

/**
 * This class represents interface for our "product" which is a message
 * Implementations will be specific to content type.
 *
 */
public abstract class Message {

	public abstract String getContent();
	
	public void addDefaultHeaders() {
		//Adds some default headers
		System.out.println("header added.");
	}
	
	public void encrypt() {
		//# Has some code to encrypt the content
		System.out.println("message encrypted");
	}
	
}
