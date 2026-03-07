package org.example;

public class PrinterDecorator implements Printer {

    private Printer printer;

    public PrinterDecorator(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void printingMessage(String message) {
        printer.printingMessage(message);
    }

}
