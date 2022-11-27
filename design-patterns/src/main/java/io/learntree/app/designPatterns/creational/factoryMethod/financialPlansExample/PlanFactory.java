package io.learntree.app.designPatterns.creational.factoryMethod.financialPlansExample;

public class PlanFactory {
    public static Plan createPlan(PlanType type) {
        
        switch (type) {
            case Domestic:
                return new DomesticPlan();
            case Commercial:
                return new CommercialPlan();
            case Corporate:
                return new CorporatePlan();
        }

        return null;
    }
}
