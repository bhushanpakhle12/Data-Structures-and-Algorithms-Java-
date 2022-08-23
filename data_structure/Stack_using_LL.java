package data_structure;

/*In stack using LL Overflow condition doesn't exist
* because we can create new node in a linked list any time.
* I t will occur only if memory doesn't has enough size to create a new node.*/


import java.util.Scanner;

public class Stack_using_LL {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head = null;

    public void push(){
        int data;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data: ");
        data = sc.nextInt();
        Node new_node = new Node(data);
        if (head==null){
            head = new_node;
        }
        else {
            new_node.next = head;
            head = new_node;
        }
    }

    public void pop(){
        if (head==null){
            System.out.println("Underflow Condition.");
        }
        else {
            head = head.next;
        }
    }

    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        int w,r;
        Scanner sc = new Scanner(System.in);
        Stack_using_LL x1 = new Stack_using_LL();
        do {
            System.out.println("Press 1 to push a new node to Stack");
            System.out.println("Press 2 to pop a node from Stack");
            System.out.println("Press 3 to display nodes of Stack");
            System.out.println("Enter your choice: ");
            w = sc.nextInt();
            switch(w){
                case 1:
                    x1.push();
                    break;
                case 2:
                    x1.pop();
                    break;
                case 3:
                    x1.display();
                    break;
            }
            System.out.println("Enter 0 to return to the Main Menu");
            System.out.println("Enter any key to exit");
            r = sc.nextInt();
        }while(r==0);
        System.out.println("EXIT SUCCESSFUL.");
    }
}
