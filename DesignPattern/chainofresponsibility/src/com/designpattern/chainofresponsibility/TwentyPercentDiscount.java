package com.designpattern.chainofresponsibility;

public class TwentyPercentDiscount extends Handler{

    @Override
    public double applyDiscount(Invoice invoice) {
        invoice.setDiscount(invoice.getDiscount()+invoice.getAmount()*0.2);
        System.out.println("20% calculated");
        if(invoice.getAmount()>100.0 && invoice.getAmount()<= 200.0){
            return invoice.getDiscount();
        }
        else
            return successor.applyDiscount(invoice);
    }
}
