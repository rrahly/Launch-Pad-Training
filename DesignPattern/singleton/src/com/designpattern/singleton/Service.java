package com.designpattern.singleton;

public class Service {
    private static volatile Service service;

    private Service(){
        if(service != null)
            throw new RuntimeException("Please use the getService method");
    }

    public static Service getService() {
        if(service== null){
            synchronized (Service.class){
                if(service== null)
                    service= new Service();
            }
        }
        return service;
    }
}