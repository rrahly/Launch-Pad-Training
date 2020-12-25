package com.designpattern.factorypattern;

public class PlanFactory {
    public static Plan createPlan(PlanType planType){
        switch (planType){
            case BASIC: return new BasicPlan();
            case INTERMEDIATE: return new IntermediatePlan();
            case ADVANCE: return new AdvancePlan();
            default: return null;
        }
    }
}
