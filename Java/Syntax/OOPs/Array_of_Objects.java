class Food {
    String name;
    Food(String name) {
        this.name = name;
    }
}


public class Array_of_Objects {
    public static void main(String[] args) {

    // Food[] inStock = new Food[3];

    // Food food_1 = new Food("Pizza");
    // Food food_2 = new Food("Hotdog");
    // Food food_3 = new Food("Burger");

    // inStock[0] = food_1;
    // inStock[1] = food_2;
    // inStock[2] = food_3;

    // System.out.println(inStock[0].name);

    // or another method.

    Food food_1 = new Food("Pizza");
    Food food_2 = new Food("Hotdog");
    Food food_3 = new Food("Burger");

    Food[] inStock = {food_1, food_2, food_3};
    
    System.out.println(inStock[0].name);
    }  
}
