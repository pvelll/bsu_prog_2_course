package group5.varC.sushko.products.Components;

import group5.varC.sushko.products.baseClass.Components;

public class Milk extends Components {
    public Milk(double mass){
        this.mass = mass;
    }
    static double caloriesPerGram = 0.42;
    @Override
    public double calculateCalories() {
        return mass*caloriesPerGram;
    }
}
