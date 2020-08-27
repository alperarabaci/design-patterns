package com.udemy.state.ex2;

/**
 * https://refactoring.guru/design-patterns/state/java/example
 * 
 * State is a behavioral design pattern that allows an object to 
 * change the behavior when its internal state changes.
 * 
 * The pattern extracts state-related behaviors into separate 
 * state classes and forces the original object to 
 * delegate the work to an instance of these classes, instead of acting on its own.
 */
public class Demo {
    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}