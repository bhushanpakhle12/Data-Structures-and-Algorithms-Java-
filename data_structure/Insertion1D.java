package data_structure;

import java.util.Scanner;

public class Insertion1D {
    public static void main(String[] args){
        int n,i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements for 1D Array: ");
        n = sc.nextInt();
        System.out.println("Enter elements: ");
        int a[] = new int[n];
        for (i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Elements are: ");
        for(i=0;i<n;i++){
            System.out.println(a[i]);
        }
        System.out.println("Where you want to insert the element:");
        int b[] = new int[n+1];
        int ins = sc.nextInt();
        if(ins<=n) {
            System.out.println("Enter the element to be inserted: ");
            int ele = sc.nextInt();
            for (int l = 0; l<n + 1; l++) {
                    if (l == ins - 1) {
                        b[l] = ele;
                    } else if (l<ins-1) {
                        b[l] = a[l];
                    } else {
                        b[l] = a[l-1];
                    }

            }
            System.out.println("The modified array is:");
            for(int l=0;l<n+1;l++){
                System.out.println(b[l]);
            }
        }
        else{
            System.out.println("Index out of Range");
        }

    }
}
