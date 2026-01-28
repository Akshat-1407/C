class Car {
    String name;
    Car(String name) {
        this.name = name;
    }
}

class Garage {
    void park(Car car) {
        System.out.println("You parked " +car.name+ " in the garage.");
    }
}

public class Passing_object_as_an_argument_to_another_object {
    public static void main(String[] args) {
      
        Car car_1 = new Car("BMW");
        Car car_2 = new Car("Tesla");
        
        Garage garage = new Garage();

        garage.park(car_1);
        garage.park(car_2);
    }
}
