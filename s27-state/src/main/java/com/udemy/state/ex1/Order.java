package com.udemy.state.ex1;

//Context class
public class Order {

	private OrderState currentState;
	
	public Order() {
		currentState = new New();
	}
	
	public double cancel() {
		double charge = currentState.handleCancellation();
		return charge;
	}
   
	public void paymentSuccessful() {
		currentState = new Paid();
	}
	
	public void dispatched() {
		currentState = new InTransit();
	}
	
	public void delivered() {
		currentState = new Delivered ();
	}
}
