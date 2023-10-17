package group5.varC.sushko.products.Dishes;

import group5.varC.sushko.products.ReflectionCheck.ReflectionChecker;
import group5.varC.sushko.products.baseClass.Food;
import group5.varC.sushko.products.interfaces.ConsistOf;
import group5.varC.sushko.products.interfaces.Nutritious;

import java.util.ArrayList;

public class Sandwich implements Nutritious, ConsistOf {
    ArrayList<Food> foodArrayList = new ArrayList<Food>();
    @Override
    public double calculateCalories() {
        double calories = 0;
        for(Food a : foodArrayList){
            calories += a.calculateCalories();
        }
        return calories;
    }

    @Override
    public void ProductConsistOf() {
        ReflectionChecker reflectionChecker = new ReflectionChecker();
        for(Food a: foodArrayList){
            System.out.println(ReflectionChecker.showClassName(a));
        }
    }
    @Override
    public void setCompound(Food food) {

        foodArrayList.add(food);
    }
}
