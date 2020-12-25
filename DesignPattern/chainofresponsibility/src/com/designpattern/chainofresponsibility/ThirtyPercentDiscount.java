package com.designpattern.chainofresponsibility;

public class ThirtyPercentDiscount extends Handler{

    @Override
    public double applyDiscount(Invoice invoice) {
        invoice.setDiscount(invoice.getDiscount()+invoice.getAmount()*0.3);
        System.out.println("30% calculated");
        return invoice.getDiscount();
    }
}
