package com.coffeepoweredcrew.volatile_example;

class TestVolatile extends Thread{
    /* 
     * Variable Volatile: Volatile Keyword is applicable to variables.
     * volatile keyword in Java guarantees that value of the volatile variable
     * will always be read from main memory and not from Thread's local cache.
    */
	//boolean keepRunning = true;
    volatile boolean keepRunning = true;

    public void run() {
        long count=0;
        while (keepRunning) {
            count++;
        }

        System.out.println("Thread terminated." + count);
    }

    public static void main(String[] args) throws InterruptedException {
        TestVolatile t = new TestVolatile();
        t.start();
        Thread.sleep(1000);
        System.out.println("after sleeping in main");
        t.keepRunning = false;
        t.join();
        System.out.println("keepRunning set to " + t.keepRunning);
    }
}