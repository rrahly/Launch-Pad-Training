package com.designpattern.chainofresponsibility;

public class Application {
    public static void main(String[] args) {
        Discount discount= new Discount();
        TenPercentDiscount tenPercentDiscount= new TenPercentDiscount();
        TwentyPercentDiscount twentyPercentDiscount= new TwentyPercentDiscount();
        ThirtyPercentDiscount thirtyPercentDiscount= new ThirtyPercentDiscount();

        discount.setSuccessor(tenPercentDiscount);
        tenPercentDiscount.setSuccessor(twentyPercentDiscount);
        twentyPercentDiscount.setSuccessor(thirtyPercentDiscount);

        Invoice invoice= new Invoice(1,100.0);
        System.out.println(discount.applyDiscount(invoice));

        Invoice invoice1= new Invoice(1,150.0);
        System.out.println(discount.applyDiscount(invoice1));

        Invoice invoice2= new Invoice(1,200.0);
        System.out.println(discount.applyDiscount(invoice2));

        Invoice invoice3= new Invoice(1,300.0);
        System.out.println(discount.applyDiscount(invoice3));
    }
}
