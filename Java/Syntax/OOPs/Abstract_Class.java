
abstract class Vehicle {
	abstract void go();

}
class Car extends Vehicle{
	@Override
	void go() {
		System.out.println("The driver is driving the car");	
	}
}


public class Abstract_Class {
	public static void main(String[] args) {
		
		// abstract =  	abstract classes cannot be instantiated, but they can have a subclass
		//				abstract methods are declared without an implementation
		//				since we cannot use any method or attribute of the abstract class we are forced to override the methods on the child class.
		
		//Vehicle vehicle = new Vehicle();  we cannot instantiate a vehicle class because it is abstract class. 
		//					Vehicle vehicle = new Vehicle(); this is what we mean by instantiate.

		Car car = new Car();

		car.go();
	}
}


