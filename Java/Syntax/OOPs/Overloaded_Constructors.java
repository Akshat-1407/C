class Pizza {

    String bread;
    String sauce;
    String cheese;
    String toppings;

    Pizza(String bread) {
        this.bread = bread;
    }
    Pizza(String bread, String sauce) {
        this.bread = bread;
        this.sauce = sauce;
    }
    Pizza(String bread, String sauce, String cheese) {
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
    }
    Pizza(String bread, String sauce, String cheese, String toppings) {
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
        this.toppings = toppings;
    }

}

public class Overloaded_Constructors {
    public static void main(String[] args) {
        System.out.println();

        Pizza pizza_1 = new Pizza("Thick Crust");
        System.out.println(pizza_1.bread);

        System.out.println();

        Pizza pizza_2 =new Pizza("Thick Crust", "Tomato");
        System.out.println(pizza_2.bread);
        System.out.println(pizza_2.sauce);

        System.out.println();

        Pizza pizza_3 =new Pizza("Thick Crust", "Tomato", "Mozerella");
        System.out.println(pizza_3.bread);
        System.out.println(pizza_3.sauce);
        System.out.println(pizza_3.cheese);

        System.out.println();

        Pizza pizza_4 =new Pizza("Thick Crust", "Tomato", "Mozerella", "Chilli Flakes");
        System.out.println(pizza_4.bread);
        System.out.println(pizza_4.sauce);
        System.out.println(pizza_4.cheese);
        System.out.println(pizza_4.toppings);


    }   
}
