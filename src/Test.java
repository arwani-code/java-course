import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        ArrayList<ArrayList<String>> groceryList = new ArrayList<>();

        ArrayList<String> drinks = new ArrayList<String>();
        drinks.add("Soda");
        drinks.add("Milk");
        drinks.add("Coffe");
        drinks.add("Tea");

        ArrayList<String> foods = new ArrayList<String>();
        foods.add("Humberger");
        foods.add("Sushi");
        foods.add("Sandwich");
        foods.add("Hotdog");

        ArrayList<String> sncaks = new ArrayList<String>();
        sncaks.add("Pottato");
        sncaks.add("Ramen");

        groceryList.add(foods);
        groceryList.add(drinks);
        groceryList.add(sncaks);

        for (int i = 0; i < groceryList.size(); i++) {

            System.out.println();
            for (int j = 0; j <= i; j++) {
                System.out.print(groceryList.get(j));
            }
            System.out.println();

        }
    }

}
