
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class MatrixMultiplication {
    public static void main(String[] args) {
        int m,n,p,q;
        System.out.println("Enter the no of rows and columns of first matrix");
        Scanner sc=new Scanner(System.in);
        m=sc.nextInt();
        n=sc.nextInt();
        System.out.println("Enter the no of rows and columns of second matrix");
        p=sc.nextInt();
        q=sc.nextInt();
        int[][] a=new int[m][n];
        int[][] b=new int[p][q];
        if(n!=p){
            System.out.println("Matrix multiplication is invalid");
        }
        else{
            System.out.println("Enter the elements of first matrix");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j]=sc.nextInt();
                }
            }
            System.out.println("Enter the elements of second matrix");
            for (int i = 0; i < p; i++) {
                for (int j = 0; j < q; j++) {
                    b[i][j]=sc.nextInt();
                }
            }
            int[][] c=new int[m][q];
            for (int i = 0; i < m; i++) {
                for (int k = 0; k < q; k++) {
                    c[i][k]=0;
                    for (int j = 0; j < n; j++) {
                        c[i][k]+=a[i][j]*b[j][k];
                    }
                }   
            }
            System.out.println("Product = ");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < q; j++) {
                    System.out.println(c[i][j] + " ");
                }
                System.out.println("");
                
            }
        }
    }
}
