package group5.varC.sushko.products.Components;

import group5.varC.sushko.products.baseClass.Food;


public class Cheese extends Food {
    private String mass;
    private String yearOfProduction;

    public Cheese(String mass, String yearOfProduction) {
        super("Сыр");
        this.mass = mass;
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public boolean equals(Object object) {
        if(super.equals(object)){
            if (!(object instanceof Cheese)) return false;
            if(this.mass.equals(((Cheese) object).mass) && this.yearOfProduction.equals(((Cheese) object).yearOfProduction)) return true;
        }
        return false;
    }
    public String toString(){
        return "сыр массой " + mass + " и годом производства " + yearOfProduction;
    }

    public void consume() {
        System.out.println(this + " съеден");
    }

    public String getYearOfProduction(){
        return yearOfProduction;
    }
    public String getMass(){
        return mass;
    }

    @Override
    public int calculateCalories() {
        if(Integer.getInteger(yearOfProduction) < 1950) return Integer.getInteger(mass)*30;
        else return Integer.getInteger(mass)*20;
    }
}
