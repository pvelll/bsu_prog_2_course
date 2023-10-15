package group5.varC.sushko.products.Components;

import group5.varC.sushko.products.baseClass.Food;
import group5.varC.sushko.products.interfaces.Nutritious;

public class Bread extends Food {
    private double mass;
    private String type;
    public Bread(double mass, String type){
        super("Bread");
        this.mass = mass;
        this.type = type;
    }

    @Override
    public void consume() {
        System.out.println("Съеден");
    }
    @Override
    public boolean equals(Object object) {
        if(super.equals(object)){
            if (!(object instanceof Bread)) return false;
            if(Double.compare (mass, ((Bread) object).mass) == 0 && type.equals(((Bread) object).type)) return true;
        }
        return false;
    }
    public String toString(){
        return "Хлеб массой " + Double.toString(mass) + " и видом " + type;
    }

    public double getMass(){
        return mass;
    }

    public String getType() {
        return type;
    }

    @Override
    public double calculateCalories() {
        if(type.equals("бородинский")) return mass*22.4;
        else
            return mass*14.5;
    }
}
