package com.company.liskovV2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import com.company.liskovV2.LiskovRectangle;
import com.company.liskovV2.LiskovSquare;

class LiskovShapeTest {

	private static final int HEIGHT = 20;
	private static final int WIDTH = 30;
	private static final int SIDE = 40;
	
	@Test
	void testRectangle() {
		LiskovRectangle rectangle = new LiskovRectangle(WIDTH, HEIGHT);
		assertThat(rectangle.getHeight()).isEqualTo(HEIGHT);
		assertThat(rectangle.getWidth()).isEqualTo(WIDTH);
		int area = rectangle.computeArea();
		
		assertThat(area).isEqualTo(HEIGHT * WIDTH);
	}
	
	@Test
	void testSquare() {
		LiskovSquare square = new LiskovSquare(SIDE);
		assertThat(square.getSide()).isEqualTo(SIDE);
		
		int area = square.computeArea();
		assertThat(area).isEqualTo(SIDE * SIDE);
	}

}
