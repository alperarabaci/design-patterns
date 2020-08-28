package com.udemy.proxy.ex1.dynamic_proxy;

import java.lang.reflect.Proxy;

import com.udemy.proxy.ex1.static_proxy.Image;

import javafx.geometry.Point2D;

public class DynamicClient {

	public static void main(String[] args) {
		//Get Image from factory.
		Image img = ImageFactory.getImage("MyPic.bmp");
		//Client is again unaware of existence of proxy 
		img.setLocation(new Point2D(10, 10));
		System.out.println("Image Location: "+img.getLocation());
		System.out.println("Starting render...");
		//Actual object should be created at this time
		img.render();
	}
}
