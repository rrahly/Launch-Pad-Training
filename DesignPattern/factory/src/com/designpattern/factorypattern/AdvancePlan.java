package com.designpattern.factorypattern;

public class AdvancePlan extends Plan{

    @Override
    protected void createPlan() {
        medicalInsurance.add(new Hospitalization());
        medicalInsurance.add(new OPD());
        medicalInsurance.add(new VirtualConsultation());
        medicalInsurance.add(new ForeignTreatment());
    }
}
