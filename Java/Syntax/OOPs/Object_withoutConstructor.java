class Car {

    String make = "Maruti";
    String model = "WagonR";
    int year = 2020;
    double price = 1500000.00;
    String colour = "Black";

    void drive() {
        System.out.println("The car is driving.");
    }
    void brake() {
        System.out.println("You stepped on the brakes.");
    }
}

public class Object_withoutConstructor {
    public static void main(String[] args) throws Exception {

        Car myCar_1 = new Car();
        Car myCar_2 = new Car();

        System.out.println("Colour of myCar_1: " + myCar_1.colour);
        System.out.println("Colour of myCar_2: " + myCar_2.colour);
        System.out.println();
        System.out.println("Year of myCar_1: " + myCar_1.year);
        System.out.println("Year of myCar_2: " + myCar_2.year);
        System.out.println();
        System.out.println("Model of myCar_1: " + myCar_1.model);
        System.out.println("Model of myCar_2: " + myCar_2.model);
        
    }  
}

