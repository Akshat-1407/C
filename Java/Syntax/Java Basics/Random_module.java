import java.util.Random;
public class Random_module {
    public static void main(String[] args) {
        Random random = new Random();

        System.out.println(random.nextInt(6));  // this will give value from 0-6. To get value form 1-6 use <System.out.println(random.nextInt(6)+1>
        System.out.println(random.nextDouble());
        System.out.println(random.nextBoolean());
        System.out.println(random.nextFloat());
    }
    
}
