class Vehicle {
    void go() {
        System.out.println("The vehicle is moving.");
    }
    void stop() {
        System.out.println("The vehicle is stopped.");
    }
}

class Car extends Vehicle {
    int wheels = 4;
    int doors = 4;
}

class Motorcycle extends Vehicle {
    int wheels = 2;
    int doors = 0;
}

public class Inheritance {
    public static void main(String[] args) {
        Car car = new Car();
        Motorcycle bike = new Motorcycle();

        car.go();
        bike.stop();

        System.out.println(car.wheels);
        System.out.println(car.doors);
        
        System.out.println(bike.doors);
        System.out.println(bike.wheels);
    }
}