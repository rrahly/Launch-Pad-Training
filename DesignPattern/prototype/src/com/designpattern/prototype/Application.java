package com.designpattern.prototype;

public class Application {
    public static void main(String[] args) {
        Registry registry= new Registry();

        Manager manager= (Manager) registry.getEmployee(EmployeeType.MANAGER);
        System.out.println(manager);

        manager.setManagerType("Research");
        System.out.println(manager);

        Manager manager1= (Manager) registry.getEmployee(EmployeeType.MANAGER);
        System.out.println(manager1);
    }
}
