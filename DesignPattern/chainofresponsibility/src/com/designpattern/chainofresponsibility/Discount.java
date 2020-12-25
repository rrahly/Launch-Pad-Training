package com.designpattern.chainofresponsibility;

public class Discount extends Handler{

    @Override
    public double applyDiscount(Invoice invoice) {
        return successor.applyDiscount(invoice);
    }
}
