//CSE-19-17
import java.util.Scanner;

public class Degree_Qualification {
    public static void main(String[] args) {
        float A,B,perA,perB;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your marks in your main subject A and subsidiary subject B out of 100");
        A=sc.nextFloat();
        B= sc.nextFloat();
        perA=A/100*100;
        perB=B/100*100;
        if (perA>=55 && perB>=45){
            System.out.println("You are qualified for the degree ");
        } else if ((perA<55 && perB>=55) && perA>=45 ) {
            System.out.println("You are qualified for the degree");
        } else if (perA>=65 && perB<45) {
            System.out.println("You are allowed to repair for the exam in B to qualify");
        }
        else {
            System.out.println("You have failed  ");
        }
        sc.close();
    }
}