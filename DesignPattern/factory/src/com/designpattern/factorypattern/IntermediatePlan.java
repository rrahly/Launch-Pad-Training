package com.designpattern.factorypattern;

public class IntermediatePlan extends Plan{

    @Override
    protected void createPlan() {
        medicalInsurance.add(new Hospitalization());
        medicalInsurance.add(new OPD());
        medicalInsurance.add(new VirtualConsultation());
    }
}
