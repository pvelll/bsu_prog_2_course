package group5.varC.sushko.products.Components;

import group5.varC.sushko.products.baseClass.Components;

public class Bread extends Components {
    public Bread(int mass){
        this.mass = mass;
    }
    static double caloriesPerGram = 2.65;
    @Override
    public double calculateCalories() {
        return mass*caloriesPerGram;
    }
}
