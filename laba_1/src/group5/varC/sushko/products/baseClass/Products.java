package group5.varC.sushko.products.baseClass;

import group5.varC.sushko.products.interfaces.Nutritious;

public abstract class Products implements Nutritious {
    protected double mass;
    protected double price;
    public double getPrice() {
        return price;
    }
    public double getMass() {
        return mass;
    }
    public void setMass(double mass) {
        this.mass = mass;
    }
    public void setPrice(double price) {
        this.price = price;
    }





}
