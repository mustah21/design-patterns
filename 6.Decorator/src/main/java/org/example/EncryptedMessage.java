package org.example;

public class EncryptedMessage extends PrinterDecorator {


    public EncryptedMessage(Printer printer) {
        super(printer);
    }

    @Override
    public void printingMessage(String message) {
        super.printingMessage(CaesarCipher.encrypt(message, 2));
    }

}
