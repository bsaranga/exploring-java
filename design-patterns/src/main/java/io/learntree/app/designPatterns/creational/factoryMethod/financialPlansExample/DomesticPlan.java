package io.learntree.app.designPatterns.creational.factoryMethod.financialPlansExample;

public class DomesticPlan extends Plan {

    public DomesticPlan() {
        super.setRate(5);
        super.setMultiplier(2.1);
    }

    @Override
    public void getInfo() {
        System.out.println(String.format("Created domestic plan with final rate: %s, and default plan bill of: %s", super.getFinalRate(), super.getPlanBill(12)));
    }
    
}
