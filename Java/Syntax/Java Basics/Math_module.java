import java.util.Scanner;

public class Math_module {
    public static void main(String[] args) {

        // double x = 3.14;
        // double y = -10;

        // System.out.println(Math.max(x, y));
        // System.out.println(Math.min(x, y));
        // System.out.println(Math.sqrt(x));
        // System.out.println(Math.abs(y));
        // System.out.println(Math.ceil(x));
        // System.out.println(Math.floor(x));
        // System.out.println(Math.round(x));
        // System.out.println(Math.pow(2, 4));

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first side of the triangle: ");
        double side_1 = input.nextInt();

        System.out.print("Enter the second side of the triangle: ");
        double side_2 = input.nextInt();
        
        double hypertonuse = Math.sqrt(Math.pow(side_1, 2) + Math.pow(side_2, 2));
        System.out.println("Hypertonuse of the triangle of side "+side_1+" and "+side_2+" is "+hypertonuse);

        input.close();




    }

}