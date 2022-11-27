package io.learntree.app.designPatterns.creational.factoryMethod.financialPlansExample;

public abstract class Plan {
    
    private double rate;

    private double multiplier;
    
    public void setRate(double rate) {
        this.rate = rate;
    }
    
    public void setMultiplier(double multiplier) {
        this.multiplier = multiplier;
    }

    protected double getFinalRate(){
        return rate * multiplier;
    };

    protected double getPlanBill(int period) {
        return this.getFinalRate() * period;
    }

    public void getInfo() {
        
    }

}
