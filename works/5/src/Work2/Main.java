package Work2;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        MyClass myClass = new MyClass();
        Class clazz = myClass.getClass();
        for(Field f : clazz.getFields()) {
            System.out.println(f.getName());
        }
        System.out.println("Methods");
        for (Method m : clazz.getDeclaredMethods()) {
            System.out.println(m.getName());
        }
        Field field = clazz.getDeclaredField("field3");
        field.setAccessible(true);
        field.set(myClass, "hello");
        field.setAccessible(false);
        Class superClazz = clazz.getSuperclass();

        field.set(myClass, 4);
        System.out.println(myClass.field1);
        clazz.getAnnotations();
    }
}
