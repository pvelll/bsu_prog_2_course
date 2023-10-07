package group5.varC.sushko.products.baseClass;

import java.util.ArrayList;

public abstract class Dish extends Products {
    protected ArrayList<Components> listOfProducts;
    {
        listOfProducts = new ArrayList<Components>();
    }

    protected void addProduct(Components object){
        listOfProducts.add(object);
    }

}
