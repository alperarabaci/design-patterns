package com.udemy.state.ex1;

/**
 * 
 * what a lousy example. check ex2
 * @author alper
 *
 */
public class Client {

    public static void main(String[] args) {
        Order order = new Order();
        order.cancel();
        
        System.out.println("---------- ---------- ---------- ----------");

        Order order2 = new Order();
        order2.delivered();
        order2.cancel();
        
        System.out.println("---------- ---------- ---------- ----------");

        Order order3 = new Order();
        order3.paymentSuccessful();
        order3.dispatched();
        order3.cancel();
        
         
    }
}
