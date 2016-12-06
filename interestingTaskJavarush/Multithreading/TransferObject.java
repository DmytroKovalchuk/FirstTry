package com.javarush.test.level27.lesson09.home01;

public class TransferObject {
    private int value;
    protected volatile boolean isValuePresent = false; //use this variable

    public synchronized int get() throws InterruptedException
    {
       while (isValuePresent == false){
           wait(10);
       }
       isValuePresent = false;
        notifyAll();
        System.out.println("Got: " + value);
        return value;
    }

    public synchronized void put(int value) throws InterruptedException
    {
        while (isValuePresent == true){
            wait();
        }
        isValuePresent = true;
        notify();
        this.value = value;
        System.out.println("Put: " + value);
    }
}
