package org.example;

public class Main {
    public static void main(String[] args) {

        Printer printer = new BasicPrinter();
        printer.printingMessage("Hello World!");

        Printer printer2 = new EncryptedMessage(new XmlPrinter(new PrinterDecorator(new BasicPrinter())));
        printer2.printingMessage("Hello World!");


    }
}