import java.util.ArrayList;
public class Array_List2D {
    public static void main(String[] args) {

        ArrayList<ArrayList<String>> eatry = new ArrayList<>();

        ArrayList<String> fruits = new ArrayList<String>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Pineapple");

        ArrayList<String> vegetables = new ArrayList<>();

        vegetables.add("Tomato");
        vegetables.add("Potato");
        vegetables.add("Pumpkin");

        ArrayList<String> drinks = new ArrayList<>();

        drinks.add("Soda");
        drinks.add("Cold drink");

        eatry.add(fruits);
        eatry.add(vegetables);
        eatry.add(drinks);

        System.out.println(eatry);
        System.out.println(eatry.get(2));
        System.out.println(eatry.get(1).get(2));

    }
}
