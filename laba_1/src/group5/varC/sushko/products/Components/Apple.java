package group5.varC.sushko.products.Components;

import group5.varC.sushko.products.baseClass.Food;
import group5.varC.sushko.products.interfaces.Nutritious;

public class Apple extends Food {
    private String size;

    public Apple(String size) {
        super("Яблоко");
        this.size = size;
    }

    public void consume() {
        System.out.println(this + " съедено");
    }
    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }
    @Override
    public boolean equals(Object arg0) {
        if (super.equals(arg0)) {
            if (!(arg0 instanceof Apple)) return false;
            return size.equals(((Apple) arg0).size);
        } else
            return false;
    }
    @Override
    public String toString() {
        return super.toString() + " размера '" + size.toUpperCase() + "'";
    }

    @Override
    public double calculateCalories() {
        if(size.equals("большое")) return 75;
        if(size.equals("маленькое")) return 25;
        return 50;
    }
}
