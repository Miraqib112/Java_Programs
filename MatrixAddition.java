
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class MatrixAddition {
    public static void main(String[] args) {
        int m,n;
        System.out.println("Enter the no of rows and columns");
        Scanner sc=new Scanner(System.in);
        m=sc.nextInt();
        n=sc.nextInt();
        int[][] a=new int[m][n];
        int[][] b=new int[m][n];
        System.out.println("Enter the elements of first matrix");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the elements of second matrix");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                b[i][j]=sc.nextInt();
            }
        }
        int[][] c=new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                c[i][j]=a[i][j] + b[i][j];
            }
        }
        System.out.println("Sum = ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println("");
        }
        
 
        
    }
            
}
