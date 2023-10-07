package group5.varC.sushko.products;

import group5.varC.sushko.products.Dishes.Breakfast;
import group5.varC.sushko.products.Components.Bread;
import group5.varC.sushko.products.Components.Milk;
//branch laba1varC
// a,б,в,г,
public class Main {
    public static void main(String[] args){
        Bread bread = new Bread(13);
        Milk milk = new Milk(120);
        Breakfast breakfast = new Breakfast();
        breakfast.setCompound(bread);
        breakfast.setCompound(milk);
        breakfast.ProductConsistOf();
        breakfast.checkNumOfRepeatedProducts(new Milk(120));
//        if (args.length == 0) {
//            System.out.println("NO ARGS , INPUT THIS COMMANDS FROM ROOT DIRECTORY javac group5/varC/sushko/products/Main.java \n" +
//                    "java group5.varC.sushko.products.Main args");
//        } else {
//            if (args[0].equals("-calories"))
//                System.out.println("Calories in breakfast: " + breakfast.calculateCalories());
//        }
        try {
            if (args[0].equals("-calories"))
                System.out.println("calories in Breakfast:" + breakfast.calculateCalories());
        }
        catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("NO ARGS , INPUT THIS COMMANDS FROM ROOT DIRECTORY javac group5/varC/sushko/products/Main.java \n" +
                    "java group5.varC.sushko.products.Main args");
        }

    }
}