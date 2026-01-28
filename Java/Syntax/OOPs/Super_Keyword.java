// super = 	keyword refers to the superclass (parent) of an object
//			very similar to the "this" keyword
//          it is used to access the methods and attributes of the parent class.

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String toString() {
        return this.name + "\n" + this.age + "\n";
    }
}

class SuperHero extends Person{
    String power;

    SuperHero(String name, int age, String power) {
        super(name, age);
        this.power = power;
    }
    public String toString() {
        return super.toString() + this.power;
    }
}


public class Super_Keyword {
    public static void main(String[] args) {
       SuperHero hero = new SuperHero("Batman", 42, "$$$");

       System.out.println(hero.toString());
       
    }
}
