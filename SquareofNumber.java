import java.util.Scanner;

public class SquareofNumber {
    static float x;
    public  static float getsquare(){
        return x*x;
    }
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        x=sc.nextFloat();
        System.out.println("Square of " + x + "=" + getsquare());
    }
}
