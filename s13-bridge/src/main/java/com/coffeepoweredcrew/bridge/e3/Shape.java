package com.coffeepoweredcrew.bridge.e3;

public abstract class Shape {
	
	protected Color color;

	public Shape(Color color) {
		this.color = color;
	}

	abstract public String draw();
	
}