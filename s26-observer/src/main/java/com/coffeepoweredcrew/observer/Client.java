package com.coffeepoweredcrew.observer;

public class Client {

    public static void main(String[] args) {
    	Order order = getOrder("1", 200, 3);
    	System.out.println(order);
    	
    	System.out.println();
    	
    	Order order2 = getOrder("2", 500, 6);
    	System.out.println(order2);
    	
    }

	private static Order getOrder(String id, double price, int quantity) {
		Order order = new Order(id);
    	order.attach(new PriceObserver());
    	order.attach(new QuantityObserver());
    	for (int i = 0; i < quantity; i++) {
    		order.addItem(price);			
		}
		return order;
	}
}
