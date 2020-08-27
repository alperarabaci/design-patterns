package com.udemy.state.ex1;

public class Cancelled implements OrderState{

	@Override
	public double handleCancellation() {
		throw new IllegalStateException("Order already cancelled.");
	}

}
