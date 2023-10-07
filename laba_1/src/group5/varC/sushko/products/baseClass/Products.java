package group5.varC.sushko.products.baseClass;

import group5.varC.sushko.products.interfaces.Nutritious;

public abstract class Products implements Nutritious {
    protected int mass;
    protected int price;
    public int getPrice() {
        return price;
    }
    public int getMass() {
        return mass;
    }
    public void setMass(int mass) {
        this.mass = mass;
    }
    public void setPrice(int price) {
        this.price = price;
    }





}
