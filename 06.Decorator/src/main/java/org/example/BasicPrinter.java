package org.example;

public class BasicPrinter implements Printer {

    @Override
    public void printingMessage(String message) {
        System.out.println(message);
    }

}
