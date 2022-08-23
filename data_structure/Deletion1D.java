package data_structure;

import java.util.Scanner;

public class Deletion1D {
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of Elements in the array: ");
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Elements of the array are: ");
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
        System.out.println("Enter the index of element which u want to delete:");
        int delind = sc.nextInt();
        if(delind<=n) {
            int b[] = new int[n - 1];
            for (int j = 0; j < n - 1; j++) {
                if(j<delind)                    // If we cosidered the index as the array index i.e the elements starting from 0 else it will be (j<delind-1)
                {
                    b[j] = a[j];
                }
                else{
                    b[j] = a[j+1];
                }
            }
            for(int j=0;j<n-1;j++){
                System.out.println(b[j]);
            }
        }
        else{
            System.out.println("Index out of range.");
        }
    }
}
