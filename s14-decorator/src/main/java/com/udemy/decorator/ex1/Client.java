package com.udemy.decorator.ex1;

/**
 * I don't like this example
 * @author alper
 *
 */
public class Client {

	public static void main(String[] args) {
		Message m = new TextMessage("The <FORCE> is strong with this one!");
		System.out.println(m.getContent());

		Message decorator = new HtmlEncodedMessage(m);
		System.out.println(decorator.getContent());

		Message decorator2 = new Base64EncodedMessage(m);
		System.out.println(decorator2.getContent());
	}
}
