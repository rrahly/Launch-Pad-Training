package com.designpattern.prototype;

public class Manager extends Employee{
    private String managerType;

    public String getManagerType() {
        return managerType;
    }

    public void setManagerType(String managerType) {
        this.managerType = managerType;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "managerType='" + managerType + '\'' +
                '}';
    }
}
