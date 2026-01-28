public class Array {
    public static void main(String[] args) {
        
        // array = it is used to store multiple values in a single variable.

        String[] cars = {"Camaro", "Corvette", "Tesla", "Mustang"};  // it's an array

        for (int i = 0; i<cars.length; i++) {
            System.out.println(cars[i]);
        }

        // another way of writing an array:

        // String[] cars = new String[4];

        // cars[0] = "Camaro";
        // cars[1] = "Corvette";
        // cars[2] = "Tesla";
        // cars[3] = "Mustang";

        // for (int j = 0; j<cars.length; j++) {
        //     System.out.println(cars[j]);
        // }
    }
}
