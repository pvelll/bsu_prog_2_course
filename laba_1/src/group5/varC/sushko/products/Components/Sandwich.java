package group5.varC.sushko.products.Components;

import group5.varC.sushko.products.baseClass.Food;

public class Sandwich extends Food {
    private String filling1;
    private String filling2;

    public void consume() {
        System.out.println(this + " съеден");
    }

    public Sandwich(String filling1, String filling2) {
        super("Сендвич");
        this.filling1 = filling1;
        this.filling2 = filling2;
    }

    @Override
    public boolean equals(Object arg0) {
        if (!super.equals(arg0)) return false;
        if (!(arg0 instanceof Sandwich)) return false;
        return (filling2.equals(((Sandwich) arg0).filling2)) && (filling1.equals(((Sandwich) arg0).filling1));
    }

    public String toString() {
        return super.toString() + " c '" + filling1.toUpperCase() + "'" + " и '" + filling2.toUpperCase() + "'";
    }

    @Override
    public int calculateCalories() {
        int calories = 0;
        if (filling1.equalsIgnoreCase("ШПРОТ")) {
            calories += 100;
        }
        if (filling1.equalsIgnoreCase("ВЕТЧИНА")) {
            calories += 150;
        }
        if (filling1.equalsIgnoreCase("КОЛБАСКА")) {
            calories += 30;
        }
        if (filling2.equalsIgnoreCase("СЫР")) {
            calories += 80;
        }
        if (filling2.equalsIgnoreCase("БАТОН")) {
            calories += 70;
        }
        return calories;
    }

    @Override
    public int Length() {
        return super.Length() + filling1.length() + filling2.length();
    }
}
