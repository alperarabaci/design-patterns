package com.coffeepoweredcrew.objectpool;

import javafx.geometry.Point2D;

public class Client {

	public static final ObjectPool<Bitmap> bitmapPool = new ObjectPool<>( ()-> new Bitmap("Logo.bmp"), 10);
	
	public static void main(String[] args) {
		
		System.out.println("Available: " + bitmapPool.available());

		Bitmap b1 = bitmapPool.get();
		b1.setLocation(new Point2D(10, -10));
		
		System.out.println("Available: " + bitmapPool.available());

		Bitmap b2 = bitmapPool.get();
		b2.setLocation(new Point2D(10, 0));
		
		System.out.println("Available: " + bitmapPool.available());
		
		b1.draw();
		b2.draw();
		
		bitmapPool.releases(b1);
		bitmapPool.releases(b2);
		
		b1.draw();
		b2.draw();
		
		System.out.println("Available: " + bitmapPool.available());
    }
}
