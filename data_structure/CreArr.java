package data_structure;
import java.sql.SQLOutput;
import java.util.Scanner;

public class CreArr{
    public static void arrtwo(){
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
    public static void arrone(){
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
    }
    public static void main(String[] args){
        arrone();
        arrtwo();
    }

}

