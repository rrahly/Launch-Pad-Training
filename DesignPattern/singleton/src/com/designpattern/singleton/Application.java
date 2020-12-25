package com.designpattern.singleton;

public class Application {

    public static void main(String[] args) {
        long start;
        long end;
        start= System.currentTimeMillis();
        Service service = Service.getService();
        end= System.currentTimeMillis();
        System.out.println(service);
        System.out.println(end-start);

        Service service1= Service.getService();
        end= System.currentTimeMillis();
        System.out.println(service1);
        System.out.println(end-start);
    }
}