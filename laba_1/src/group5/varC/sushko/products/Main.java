package group5.varC.sushko.products;

import group5.varC.sushko.products.Cocktail;
import group5.varC.sushko.products.Components.Bread;
import group5.varC.sushko.products.Components.Milk;

public class Main {
    public static void main(String[] args){
        Bread bread = new Bread(13.2);
        Milk milk = new Milk(120.3);
        Cocktail cocktail = new Cocktail();
        cocktail.setCompound(bread);
        cocktail.setCompound(milk);
        System.out.println("calories in coctail:" + cocktail.calculateCalories());
        cocktail.ProductConsistOf();
    }
}