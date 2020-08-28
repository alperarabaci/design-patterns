package com.udemy.decorator.ex2.decorators;

public interface DataSource {
    void writeData(String data);

    String readData();
}