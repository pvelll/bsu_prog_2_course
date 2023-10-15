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
    public String toString(){
        return "сыр массой " + Double.toString(mass) + " и годом производства " + Integer.toString(yearOfProduction);
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

    @Override
    public double calculateCalories() {
        if(yearOfProduction < 1950) return mass*30.7;
        else return mass*20.4;
    }
}
