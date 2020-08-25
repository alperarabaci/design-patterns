package com.coffeepoweredcrew.proxy.static_proxy;

import java.awt.Point;

import javafx.geometry.Point2D;

public class StaticClient {

	public static void main(String[] args) {
		Image img = ImageFactory.getImage("A1.bmp");
		
		img.setLocation(new Point2D(10, 20));
		System.out.println("Image Location: " + img.getLocation());
		System.out.println("rendering...");
		img.render();
	}

}
