package group5.varC.sushko.products.Components;

import group5.varC.sushko.products.baseClass.Food;

public class Cheese extends Food {
    private double mass;
    private int yearOfProduction;

    public Cheese(double mass, int yearOfProduction) {
        super("Сыр");
        this.mass = mass;
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public boolean equals(Object object) {
        if(super.equals(object)){
            if (!(object instanceof Cheese)) return false;
            if(Double.compare (mass, ((Cheese) object).mass) == 0 && Integer.compare(yearOfProduction, ((Cheese) object).getYearOfProduction ()) == 0) return true;
        }
        return false;
    }

    public void consume() {
        System.out.println(this + " съеден");
    }

    public int getYearOfProduction(){
        return yearOfProduction;
    }
    public double getMass(){
        return mass;
    }

}
