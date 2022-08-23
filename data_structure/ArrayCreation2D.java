package data_structure;

import java.util.Scanner;

public class ArrayCreation2D {
    public static void main(String[] args) {
        int nr,nc;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of rows and columns: ");
        nr = sc.nextInt();
        nc = sc.nextInt();
        int b[][] = new int[nr][nc];
        for(int i=0;i<nr;i++){
            for(int j=0;j<nc;j++){
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("The elements are");
        for(int i=0;i<nr;i++){
            for(int j=0;j<nc;j++){
                System.out.println(b[i][j]);
            }
        }
    }
}
