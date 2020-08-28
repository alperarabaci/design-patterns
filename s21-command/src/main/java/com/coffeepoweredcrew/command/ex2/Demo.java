package com.coffeepoweredcrew.command.ex2;

/**
 * https://refactoring.guru/design-patterns/command/java/example
 *
 * Command is behavioral design pattern that converts requests or simple operations into objects.
 * The conversion allows deferred or remote execution of commands, storing command history, etc.
 */
public class Demo {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.init();
    }
}