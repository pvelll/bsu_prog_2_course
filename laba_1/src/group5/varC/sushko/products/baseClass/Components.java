package group5.varC.sushko.products.baseClass;

import group5.varC.sushko.products.ReflectionCheck.ReflectionChecker;

import java.util.Objects;

public abstract class Components extends Products{
    protected static double caloriesPerGram;
    @Override
    public boolean equals(Object object){
        ReflectionChecker reflectionChecker = new ReflectionChecker();
        if (this == object ) return true;
        if(object == null || getClass()!= object.getClass()) return false;
        return getMass() == ((Components) object).getMass() && Objects.equals(reflectionChecker.showClassName(this), reflectionChecker.showClassName(object));
    }
    @Override
    public double calculateCalories() {
        return 0;
    }
}
