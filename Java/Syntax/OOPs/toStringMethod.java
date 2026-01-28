class Car {
    String make = "Ford";
    String model = "Mustang";
    String color = "red";
    int year = 2021;
    
    public String toString() {
        return make +"\n"+model+"\n"+color+"\n"+year;
    } 
}

public class toStringMethod {
    public static void main(String[] args) {
  
    // toString() = special method that all objects inherit, 
    //              that returns a string that "textually represents" an object.
    //              can be used both implicitly and explicitly
    //              initially if we use toString() method with the object we will get the memory address of the object.
    //              but we can change it to do something else by redefineing the method in the constructor
  
    Car car = new Car();

    System.out.println(car.toString());
    // or
    System.out.println(car);   
    }
}

