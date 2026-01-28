public class Swap_Variable_Values {
    public static void main(String[] args) {
        String x = "Water";
        String y = "Juice";
        String temp;

        temp = x;   // we created a temporary empty variable and stored the value of x in it.
        x = y;      // now variable x is empy and we can store the value of y in it.
        y = temp;   // now variable y is empty and we can store the value of temp which was initially the value of x in y.

        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }
    
}
