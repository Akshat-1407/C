class Human {

    String name;
    int age;
    int height;
    double weight;

    Human(String name, int age, int height, double weight) {  // This is a constructor. If we do not use constructor each object we will make will be identical. There will be no difference between them.
                                                              // we can use constructor to make an object such that we can pass in different sets of arguments so that each object is different.
        this.name = name;           
        this.age = age;                                       // this. keyword is used here
        this.height = height;                                 // we can think of this keyword as it is replacin the name of the object i.e. human1 or human2
        this.weight = weight;                                 // in python we use self in place of this.                                     
    }

    void eat() {
        System.out.println(this.name + " is eating.");
    }
    void sleep() {
        System.out.println(this.name + " is sleeping.");
    }
}

public class Constructors {
    public static void main(String[] args) {
        
        Human human1 = new Human("John", 25, 176, 60);  // instance of class
        Human human2 = new Human("Rick", 16, 165, 50);  // by writing Human human2 we are declaring the instance of a class

        System.out.println("Name of human1: " + human1.name);
        System.out.println("Name of human2: " + human2.name);
        System.out.println();
        System.out.println("Weight of human1: " + human1.weight);
        System.out.println("Weight of human2: " + human2.weight);
        System.out.println();
        System.out.print("eat fn of human1: ");  human1.eat();
        System.out.print("eat fn of human2: ");  human2.eat();
        System.out.println();
        System.out.print("sleep fn of human1: ");  human1.sleep();
        System.out.print("sleep fn of human2: ");  human2.sleep();
    }
    
}
