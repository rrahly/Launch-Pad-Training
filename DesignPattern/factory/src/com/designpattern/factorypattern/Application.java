package com.designpattern.factorypattern;

public class Application {
    public static void main(String[] args) {
        Plan plan = PlanFactory.createPlan(PlanType.BASIC);
        System.out.println(plan);

        Plan plan1= PlanFactory.createPlan(PlanType.INTERMEDIATE);
        System.out.println(plan1);

        Plan plan2= PlanFactory.createPlan(PlanType.ADVANCE);
        System.out.println(plan2);
    }
}
