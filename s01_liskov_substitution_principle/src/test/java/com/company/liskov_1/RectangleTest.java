package com.company.liskov_1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class RectangleTest {

	private static final int HEIGHT = 20;
	private static final int WIDTH = 30;

	@Test
	final void testRectangle() {
		Rectangle rectangle = new Rectangle(10, 20);
		setRectangleAndAssert(rectangle);
	}

	/**
	 * test not work!
	 * violation of liskov
	 * violation of parent behaviour
	 */
	@Test
	final void testSquare() {
		Square square = new Square(10);
		setRectangleAndAssert(square);
	}

	private void setRectangleAndAssert(Rectangle rectangle) {
		rectangle.setHeight(HEIGHT);
		rectangle.setWidth(WIDTH);
		assertThat(rectangle.getHeight()).isEqualTo(HEIGHT);
		assertThat(rectangle.getWidth()).isEqualTo(WIDTH);
	}

}
