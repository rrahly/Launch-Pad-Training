package com.designpattern.factorypattern;

import java.util.ArrayList;
import java.util.List;

public abstract class Plan {
    protected List<MedicalInsurance> medicalInsurance= new ArrayList<>();

    public Plan(){
        createPlan();
    }

    protected abstract void createPlan();

    @Override
    public String toString() {
        return "Plan{" +
                "medicalInsurance=" + medicalInsurance +
                '}';
    }
}
