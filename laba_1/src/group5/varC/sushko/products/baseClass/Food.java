package group5.varC.sushko.products.baseClass;

import group5.varC.sushko.products.interfaces.Consumable;
import group5.varC.sushko.products.interfaces.Nutritious;

public abstract class Food implements Consumable, Nutritious {
    String name = null;

    public Food(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object arg0) {
        if (!(arg0 instanceof Food)) return false;
        if (name == null || ((Food) arg0).name == null) return false; // Шаг 2
        return name.equals(((Food) arg0).name); // Шаг 3
    }

    public String toString() {
        return name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

