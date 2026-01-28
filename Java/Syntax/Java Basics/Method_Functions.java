public class Method_Functions {
    public static void main(String[] args) {
    
    // method = a block of code that is executed whenever it is called upon
    
    int x = 3;
    int y = 4;
    
    int z = add(x,y);
    System.out.println(z);
    }
    
    static int add(int x, int y) {  // int is the return value of the function
									// if the function do not have a return value then void is used.
    	int z = x + y;
    	return z;
    }
    
}

/*
 	// overloaded methods = methods that share the same name but have different parameters
	//						method name + parameters = method signature
	
	double x = add(1.0,2.0,3.0,4.0);
	System.out.println(x);
	
	static int add(int a, int b) {
		System.out.println("This is overloaded method #1");
		return a + b;
	}
	static int add(int a, int b, int c) {
		System.out.println("This is overloaded method #2");
		return a + b + c;
	}
	static int add(int a, int b, int c, int d) {
		System.out.println("This is overloaded method #3");
		return a + b + c + d;
	}
	static double add(double a, double b) {
		System.out.println("This is overloaded method #4");
		return a + b;
	}
	static double add(double a, double b, double c) {
		System.out.println("This is overloaded method #5");
		return a + b + c;
	}
	static double add(double a, double b, double c, double d) {
		System.out.println("This is overloaded method #6");
		return a + b + c + d;
	}	
*/
