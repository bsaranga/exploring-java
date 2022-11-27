package io.learntree.app.designPatterns.creational.factoryMethod.financialPlansExample;

public class CommercialPlan extends Plan {

    public CommercialPlan() {
        super.setRate(5);
        super.setMultiplier(1.2);
    }
    
}
