package com.coffeepoweredcrew.bridge.e3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ShapeTest {

	@Test
	public void whenBridgePatternInvoked_thenConfigSuccess() {
	    //a square with red color
	    Shape square = new Square(new Red());
	 
	    assertEquals(square.draw(), "Square drawn. Color is Red");
	}
}
