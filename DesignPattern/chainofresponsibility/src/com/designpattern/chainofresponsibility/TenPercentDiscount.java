package com.designpattern.chainofresponsibility;

public class TenPercentDiscount extends Handler{

    @Override
    public double applyDiscount(Invoice invoice) {
        invoice.setDiscount(invoice.getDiscount()+invoice.getAmount()*0.1);
        System.out.println("10% calculated");
        if(invoice.getAmount()<=100.0){
            return invoice.getDiscount();
        }
        else
            return successor.applyDiscount(invoice);
    }
}
