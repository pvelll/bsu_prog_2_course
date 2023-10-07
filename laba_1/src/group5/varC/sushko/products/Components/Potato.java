package group5.varC.sushko.products.Components;

import group5.varC.sushko.products.baseClass.Components;

public class Potato extends Components {
    public Potato(double mass){
        this.mass = mass;
    }
    @Override
    public double calculateCalories() {
        return mass*caloriesPerGram;
    }
    static double caloriesPerGram = 1.0;

}
