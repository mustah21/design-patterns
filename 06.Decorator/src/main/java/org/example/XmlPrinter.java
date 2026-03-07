package org.example;

public class XmlPrinter extends PrinterDecorator {

    public XmlPrinter(Printer printer) {
        super(printer);
    }

    @Override
    public void printingMessage(String message) {
        super.printingMessage("<message>" + message + "</>");
    }
}
