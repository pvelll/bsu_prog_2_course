package group5.varC.sushko.products;

import group5.varC.sushko.products.baseClass.Food;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Comparator;

//branch laba1varC
//javac group5/varC/sushko/products/Main.java  + java group5.varC.sushko.products.Main args
public class Main {
    public static void main(String[] args) {
        args = new String[4];
        args[0] = "Apple/большое ";
        args[1] = "Sandwich/колбаска/ветчина";
        args[2] = "-calories";
        args[3] = "-sort";

        Food[] breakfast = new Food[20];
        boolean sort = false;
        boolean calories = false;
//        ReflectionChecker reflectionChecker = new ReflectionChecker();
//        Apple apple = new Apple("большое");
//        System.out.println(reflectionChecker.showClassName(apple);
        int counterBreakfast = 0;

        for (int item = 0; item < args.length; item++) {
            if (args[item].equals("-calories")) {
                calories = true;

                sort = true;
            } else {
                String[] parts = args[item].split("/");
                String[] param = new String[parts.length - 1];
                for (int i = 0; i < parts.length - 1; i++) {
                    param[i] = parts[i + 1];
                }
//System.out.println(param.length);

//обработка исключений
                try {
                    Class clazz = Class.forName("group5.varC.sushko.products.Components." + parts[0]);
                    System.out.println("количество параметров " + clazz.getConstructor(clazz.getConstructors()[0].getParameterTypes()).getParameterTypes().length);
                    System.out.println("количество прарметров  в массиве " + param.length);
                    breakfast[counterBreakfast] = (Food) clazz.getConstructor(clazz.getConstructors()[0].getParameterTypes()).newInstance(param);
                    counterBreakfast++;
                } catch (InstantiationException | IllegalAccessException | InvocationTargetException ex) {
                    System.out.print(ex);
                } catch (ClassNotFoundException ex) {
                    System.out.println("Введите существующий класс!");
                } catch (NoSuchMethodException ex) {
                    System.out.println("Введите правильные параметры класса!");
                }
            }
        }
        for (int i = 0; i < breakfast.length; i++) {
            if (breakfast[i] == null) break;
            breakfast[i].consume();
        }
        int count = 0;
        Food[] diff = new Food[counterBreakfast];
        for (int i = 0; i < counterBreakfast; i++) {
            count = 1;
            boolean to_continue = false;
            for (int j = 0; j < counterBreakfast; j++) {
                if (diff[j] == null) continue;
                if (diff[j].equals(breakfast[i])) {
                    to_continue = true;
                }
            }
            if (to_continue) continue;
            for (int j = i + 1; j < counterBreakfast; j++) {
                if ((breakfast[j].equals(breakfast[i]))) {
                    count++;
                }
            }
            diff[i] = breakfast[i];
            breakfast[i].consume();
            System.out.println(count + " раз(а)");
        }
        if (calories) {
            int calorii = 0;
            for (int i = 0; i < counterBreakfast; i++) calorii += breakfast[i].calculateCalories();
            System.out.println("калорийность: " + calorii);
        }
        if (sort) {
            Arrays.sort(breakfast, new Comparator() {
                public int compare(Object f1, Object f2) {
                    if (f1 == null) return -1;
                    if (f2 == null) return 1;
                    if (((Food) f1).Length() > ((Food) f2).Length()) return 1;
                    if (((Food) f1).Length() < ((Food) f2).Length()) return -1;
                    return 0;
                }
            });
        }
        System.out.println("\nОтсортированные продукты:\n");
        for (int i = 0; i < breakfast.length; i++) {
            if (breakfast[i] == null) continue;
            System.out.println(breakfast[i].toString() + " " + breakfast[i].calculateCalories());
            breakfast[i].consume();
        }
        System.out.print("\nСъедено продуктов: " + counterBreakfast);
        System.out.println("\n\nВсего хорошего!");

    }
}