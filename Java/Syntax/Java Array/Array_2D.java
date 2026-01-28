public class Array_2D {

	public static void main(String[] args) {
			
		// 2D array = an array of arrays
		
		String[][] cars = 	{	
								{"Camaro","Corvette","Silverado"},
								{"Mustang","Ranger","F-150"},
								{"Ferrari","Lambo","Tesla"}
							};
		
		for (int i = 0; i<3; i++) {                       //  for(int i=0; i<cars.length; i++) {
			for (int j = 0; j<3; j++) {                   //  			System.out.println();
				System.out.print(cars[i][j]+", ");        //  			for(int j=0; j<cars[i].length; j++) {
			}                                             //  				System.out.print(cars[i][j]+" ");
			System.out.println();                         //  			}
		}												  //  }
	}
}
