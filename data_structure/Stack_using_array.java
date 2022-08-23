package data_structure;

import java.util.Scanner;
import java.util.Stack;

/* There is a pointer called top which points to the top of the stack and if the stack is empty
then its value is -1. This condition is called as Underflow Condition.
We will check this condition when we want to pop an element out.

 When the stack is completely full then the condition is called Overflow condition.
 We will check this condition when we want to push an element.*/
class stack{
    int n=10;
    int top=-1;
    int a[] = new int[n];
    Scanner sc = new Scanner(System.in);
    void push(){
        if (top==(n-1)){
            System.out.println("Overflow Condition");
        }
        else {
            System.out.println("Ënter Data: ");
            int s = sc.nextInt();
            top +=1;
            a[top] = s;
        }
    }

    void pop(){
        if (top==-1){
            System.out.println("Underflow Condition.");
        }
        else {
            top -= 1;
            System.out.println("Item Deleted");
        }
    }

    void display(){
        System.out.println("Items are: ");
        for (int j=top;j>=0;j--){
            System.out.println(a[j]);
        }
    }
}

public class Stack_using_array {
    public static void main(String[] args) {
        int d,v;
        Scanner sc = new Scanner(System.in);
        stack s1 = new stack();
        do {
            System.out.println("Press 1 to push data in Stack.");
            System.out.println("Press 2 to pop data from Stack.");
            System.out.println("Press 3 to display data in Stack.");
            System.out.println("Enter your choice: ");
            d = sc.nextInt();
            switch (d){
                case 1:
                    s1.push();
                    break;
                case 2:
                    s1.pop();
                    break;
                case 3:
                    s1.display();
                    break;
            }
            System.out.println("Enter 0 to go back to Main Menu");
            System.out.println("Enter any key to exit.");
            v = sc.nextInt();
        }while(v==0);
        System.out.println("EXIT SUCCESSFUL");
    }




}
