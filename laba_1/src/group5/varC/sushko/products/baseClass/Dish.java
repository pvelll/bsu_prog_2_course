package group5.varC.sushko.products.baseClass;

import group5.varC.sushko.products.ReflectionCheck.ReflectionChecker;

import java.util.ArrayList;

public abstract class Dish extends Products {
    protected ArrayList<Components> listOfProducts;
    {
        listOfProducts = new ArrayList<Components>();
    }
    public void checkNumOfRepeatedProducts(Components component){
        ReflectionChecker reflectionChecker = new ReflectionChecker();
        int counter = 0;
        for(Components comp : listOfProducts){
            if(comp.equals(component)) counter++;
        }
        System.out.println("There are " + counter +" repeats of " + reflectionChecker.showClassName(component) + " them have same mass");
    }

}
