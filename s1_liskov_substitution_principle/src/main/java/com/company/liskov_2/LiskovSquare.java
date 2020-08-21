package com.company.liskov_2;

/**
 * No longer need width or height.
 * @author alper
 *
 */
public class LiskovSquare implements LiskovShape{
	
	private int side;

	public LiskovSquare(int side) {
		setSide(side);
	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	@Override
	public int computeArea() {
		return side * side;
	}

}
