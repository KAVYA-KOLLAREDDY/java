package FunctionalInterface;

import java.lang.reflect.InvocationTargetException;

class Car {
    void start() {
        System.out.println("Car Started");
    }
}

public class Anonymousclass2  {
    public static void main(String[] args)
            throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        Car c1 = new Car() {
            public void stop() {
                System.out.println("Car Stopped");
            }
        };
        //to call the anonymousclass method which is stop here.
        c1.getClass().getMethod("stop").invoke(c1);

    }
}

