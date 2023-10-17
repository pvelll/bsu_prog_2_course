package group5.varC.sushko.products;

import group5.varC.sushko.products.Components.Apple;
import group5.varC.sushko.products.Components.Bread;
import group5.varC.sushko.products.Components.Cheese;
import group5.varC.sushko.products.Dishes.Sandwich;

//branch laba1varC
// a,б,в,г,
//javac group5/varC/sushko/products/Main.java  + java group5.varC.sushko.products.Main args
public class Main {
    public static void main(String[] args) {
        Sandwich sandwich = new Sandwich();

        Apple apple = new Apple("большое");
        Bread bread = new Bread(150.0, "бородинский");
        Cheese cheese = new Cheese(120.0, 1923);

        sandwich.setCompound(apple);
        sandwich.setCompound(bread);
        sandwich.setCompound(cheese);
        sandwich.ProductConsistOf();
        


        for(String a: args){
            if(a.equals("-calories")){
                System.out.println("calories in sandwich: " + "");
            }
        }
    }
}