package group5.varC.sushko.products.Components;

import group5.varC.sushko.products.baseClass.Components;

public class Tomato extends Components {
    public Tomato(int mass){
        this.mass = mass;
    }
    @Override
    public double calculateCalories() {
        return mass*caloriesPerGram;
    }
    static double caloriesPerGram = 0.2;
}
