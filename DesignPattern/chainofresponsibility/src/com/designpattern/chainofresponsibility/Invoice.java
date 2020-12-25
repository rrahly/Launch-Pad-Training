package com.designpattern.chainofresponsibility;

public class Invoice {
    private int invoiceNumber;
    private double amount;
    private double discount;

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public Invoice(int invoiceNumber, double amount) {
        this.invoiceNumber= invoiceNumber;
        this.amount= amount;
    }

    public int getInvoiceNumber() {
        return invoiceNumber;
    }

    public double getAmount() {
        return amount;
    }

    public double getDiscount() {
        return discount;
    }
}
