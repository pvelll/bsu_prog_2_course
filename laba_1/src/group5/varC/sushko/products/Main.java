package group5.varC.sushko.products;

import group5.varC.sushko.products.Dishes.Breakfast;
import group5.varC.sushko.products.Components.Bread;
import group5.varC.sushko.products.Components.Milk;

// a,в,
public class Main {
    public static void main(String[] args){
        Bread bread = new Bread(13);
        Milk milk = new Milk(120);
        Breakfast breakfast = new Breakfast();
        breakfast.setCompound(bread);
        breakfast.setCompound(milk);
        System.out.println("calories in Breakfast:" + breakfast.calculateCalories());
        breakfast.ProductConsistOf();
        breakfast.checkNumOfRepeatedProducts(new Milk(120));
    }
}