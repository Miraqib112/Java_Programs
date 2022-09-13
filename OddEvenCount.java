
import java.awt.Event;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class OddEvenCount {
    static int odd=0,even=0;
    public static void main(String[] args) {
        int[] array=new int[10];
        int i;
        System.out.println("Enter the elements of the array");
        for ( i = 0; i < 10; i++) {
            Scanner s=new Scanner(System.in);
            array[i]=s.nextInt();
        }
        for ( i = 0; i < 10; i++) {
            if(array[i]%2==0){
                 even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("No of even and odd numbers in the array are : " + even + "and " + odd);
        
    }
}
