package group5.varC.sushko.products.baseClass;

import group5.varC.sushko.products.interfaces.Consumable;
import group5.varC.sushko.products.interfaces.LengthOfObj;
import group5.varC.sushko.products.interfaces.Nutritious;

public abstract class Food implements Consumable, Nutritious, LengthOfObj {
    private String name = null;

    public Food(String name) {
        this.name = name;}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object arg0) {
        if (!(arg0 instanceof Food)) return false;
        if (name==null || ((Food)arg0).name==null) return false;
        return name.equals(((Food)arg0).name);
    }

    @Override
    public String toString() {
        return name;
    }
    @Override
    public int Length() {
        return name.length();
    }
}


