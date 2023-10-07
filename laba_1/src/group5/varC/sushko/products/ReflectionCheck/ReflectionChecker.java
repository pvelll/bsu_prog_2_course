package group5.varC.sushko.products.ReflectionCheck;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionChecker {
    public void showClassName(Object object){
        Class clazz = object.getClass();
        System.out.println(clazz.getName());
    }

    public void showClassFields(Object object){
        Class clazz = object.getClass();
        Field[] fields = clazz.getDeclaredFields();
        for(Field field : fields){
            System.out.println(field.getName());
        }
    }

    public void showMethods(Object object){
        Class clazz = object.getClass();
        Method[] methods = clazz.getMethods();
        for(Method method: methods){
            System.out.println(method.getName());
        }

    }
    public void showDeclaredMethods(Object object){
        Class clazz = object.getClass();
        Method[] methods = clazz.getDeclaredMethods();
        for(Method method: methods){
            System.out.println(method.getName());
        }

    }

    public void fillPrivateFields(Object object){
        Class clazz = object.getClass();
        Field[] fields = clazz.getDeclaredFields();
        for(Field field : fields){
            Annotation[] annotation = field.getAnnotations();
        }
    }

    public void showFieldsAnnotations(Object object){
        Class clazz = object.getClass();
        Field[] fields = clazz.getDeclaredFields();
        for(Field field : fields){
            Annotation[] annotations = field.getAnnotations();
            for(Annotation annotation : annotations){
                System.out.println(field.getName() +" "+  annotation.toString());
            }
        }
    }
}
