package org.example;

public class MessagePrinter {
    private MessageService printer;
    public MessageService getPrinter() {
        return printer;
    }
    public void setPrinter(MessageService printer) {
        this.printer = printer;
    }
    public void draw() {
        System.out.println("\nMessage Service: "+getPrinter().getMessage());
    }
}
