package group5.varC.sushko.products;

import group5.varC.sushko.products.ReflectionCheck.ReflectionChecker;
import group5.varC.sushko.products.baseClass.Components;
import group5.varC.sushko.products.baseClass.Dish;
import group5.varC.sushko.products.interfaces.ConsistOf;

public class Sandwich extends Dish implements ConsistOf {
    @Override
    public double calculateCalories() {
        double calories = 0.0;
        for(Components component: listOfProducts) {
            calories += component.calculateCalories();
        }
        return calories;
    }
    @Override
    public void ProductConsistOf() {
        ReflectionChecker checker = new ReflectionChecker();
        System.out.println("Cocktail consist of: ");
        for(Object object : listOfProducts){
            checker.showClassName(object);
        }
    }
    @Override
    public void setCompound(Components object) {
        listOfProducts.add(object);
    }
}
