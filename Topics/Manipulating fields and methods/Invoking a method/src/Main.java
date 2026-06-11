import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class MethodsDemo {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        // write your code here
        SomeClass obj = new SomeClass();

        Method method = SomeClass.class.getDeclaredMethods()[0];
        method.setAccessible(true);

        Object result = method.invoke(obj);

        System.out.println(result);
    }
}