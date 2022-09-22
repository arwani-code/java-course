import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Car car = new Car();

        System.out.println(car.model);
        System.out.println(car.type);
        System.out.println(car.year);
        car.startEngine();
        car.stopEngine();
    }

}
