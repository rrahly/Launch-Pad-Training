package com.designpattern.prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {
    private Map<EmployeeType, Employee> employees= new HashMap<>();

    public Registry() {
        this.initialize();
    }

    public Employee getEmployee(EmployeeType employeeType){
        Employee employee= null;
        try {
            employee= (Employee) employees.get(employeeType).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return employee;
    }

    private void initialize() {
        Manager manager= new Manager();
        manager.setEmployeeID(001);
        manager.setEmployeeName("Fahad");
        manager.setManagerType("Finance");

        Associate associate= new Associate();
        associate.setEmployeeID(002);
        associate.setEmployeeName("Rizla");
        associate.setSchedule("Full-Time");

        employees.put(EmployeeType.MANAGER, manager);
        employees.put(EmployeeType.ASSOCIATE, associate);
    }

}
