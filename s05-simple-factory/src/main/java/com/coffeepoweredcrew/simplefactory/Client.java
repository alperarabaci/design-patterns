package com.coffeepoweredcrew.simplefactory;

public class Client {

	public static void main(String[] args) {
		Post post = PostFactory.createPost("blog");
		System.out.println(post);

		Post post2 = PostFactory.createPost("news");
		System.out.println(post2);
		
		Post post3 = PostFactory.createPost("product");
		System.out.println(post3);
	}

}
