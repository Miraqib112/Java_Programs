//Question 2
import java.util.Scanner;

public class Ascii_Value {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char character;
        System.out.println("Enter any character");
        character=sc.next().charAt(0);
        int ascii_value=character;
        if (ascii_value>=65 && ascii_value<=9){
            System.out.println(character + " is a capital letter");
        } else if (ascii_value>=97 && ascii_value<=122) {
            System.out.println(character + " is a small  case letter ");
        } else if (ascii_value>=48 && ascii_value<=57) {
            System.out.println(character + " is a digit");
        } else if ((ascii_value>=0 && ascii_value<=47) || (ascii_value>=58 && ascii_value<=64) || (ascii_value>=91 && ascii_value<=96) || (ascii_value>=123 && ascii_value<=127)) {
            System.out.println(character + " is a special symbol");
        }
        sc.close();
    }
}
