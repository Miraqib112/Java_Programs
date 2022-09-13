
import java.util.Scanner;
public class ArrayDescendingSort {
    public static void main(String[] args) {
        int[] array=new int[10];
        int i;
        System.out.println("Enter the elements of the array");
        for ( i = 0; i < 10; i++) {
            Scanner s=new Scanner(System.in);
            array[i]=s.nextInt();
        }
        System.out.print("Original array = ");
        for (i = 0; i < 10; i++) {
            System.out.print(array[i] + " ");
        }
        for ( i = 0; i < 10; i++) {
            for (int j = i+1; j < 10; j++) {
                int temp=0;
                if(array[i]<array[j]){
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        System.out.println("");
        System.out.print("Array in descending order = ");
        for ( i = 0; i < 10; i++) {
            System.out.print(array[i] + " ");
        }
    }
        
}
    
