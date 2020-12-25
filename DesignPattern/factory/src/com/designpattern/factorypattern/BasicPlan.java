package com.designpattern.factorypattern;

public class BasicPlan extends Plan{

    @Override
    protected void createPlan() {
        medicalInsurance.add(new Hospitalization());
        medicalInsurance.add(new OPD());
    }
}
