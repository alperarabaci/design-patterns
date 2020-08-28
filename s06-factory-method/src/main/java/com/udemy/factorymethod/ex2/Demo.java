package com.udemy.factorymethod.ex2;

import com.udemy.factorymethod.ex2.factory.Dialog;
import com.udemy.factorymethod.ex2.factory.HtmlDialog;
import com.udemy.factorymethod.ex2.factory.WindowsDialog;

/**
 * https://refactoring.guru/design-patterns/factory-method/java/example
 *
 *  Factory method is a creational design pattern which solves the problem
 *  of creating product objects without specifying their concrete classes.
 *  
 *  actory Method defines a method, which should be used for creating objects 
 *  instead of direct constructor call (new operator). Subclasses can override 
 *  this method to change the class of objects that will be created.
 */
public class Demo {
    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    /**
     * The concrete factory is usually chosen depending on configuration or
     * environment options.
     */
    static void configure() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    /**
     * All of the client code should work with factories and products through
     * abstract interfaces. This way it does not care which factory it works
     * with and what kind of product it returns.
     */
    static void runBusinessLogic() {
        dialog.renderWindow();
    }
}