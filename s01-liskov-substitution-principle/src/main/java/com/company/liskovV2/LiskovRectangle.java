package com.company.liskovV2;

public class LiskovRectangle implements LiskovShape{

	private int width;
	
	private int height;

	public LiskovRectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	@Override
	public int computeArea() {
		return width * height;
	}

}
