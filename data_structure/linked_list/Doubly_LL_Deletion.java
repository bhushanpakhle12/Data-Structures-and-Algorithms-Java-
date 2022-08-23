package data_structure.linked_list;

import java.util.Scanner;

public class Doubly_LL_Deletion {

    static class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    Node head = null;
    Node tail = null;

    public void creation() {
        int n, data;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter Data: ");
            data = sc.nextInt();
            Node new_node = new Node(data);
            if (head == null) {
                head = new_node;
                tail = new_node;
            } else {
                int w;
                System.out.println("Enter 1 to insert data at the " +
                        "beginning, 2 to insert at the end and 3 to insert at a" +
                        "specific location.");
                w = sc.nextInt();
                switch (w) {
                    case 1:
                        head.prev = new_node;
                        new_node.next = head;
                        head = new_node;
                        break;
                    case 2:
                        tail.next = new_node;
                        new_node.prev = tail;
                        tail = new_node;
                        break;
                    case 3:
                        int dataloc;
                        Node temp = head;
                        Node ptr = temp.next;
                        System.out.println("Enter the data of the location after which you want to insert" +
                                "new data: ");
                        dataloc = sc.nextInt();
                        while (temp.data != dataloc) {
                            temp = ptr;
                            ptr = ptr.next;
                        }
                        new_node.next = temp.next;
                        new_node.prev = temp;
                        temp.next = new_node;
                        ptr.prev = new_node;
                        break;
                }
            }
            System.out.println("Do you want to enter more data? If 'Yes' press 1: ");
            n = sc.nextInt();
        } while (n == 1);
    }

    public void traverse() {
        Node temp = head;
        if (head == null) {
            System.out.println("Linked List Doesn't exist");
        } else {
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    public void deletion(){
        int s,n,data;
        Scanner sc = new Scanner(System.in);
        do {
            if (head==null){
                System.out.println("Linked List doesn't exist");
            }
            else{
                int q;
                System.out.println("Enter 1 to delete the data at the beginning, 2 to delete the data at the end and 3 to delete the data" +
                        "at a specific location");
                q = sc.nextInt();
                switch (q){
                    case 1:
                        head.next.prev = null;
                        head = head.next;
                        break;
                    case 2:
                        tail.prev.next = null;
                        tail = tail.prev;
                        break;
                    case 3:
                        int dataloc;
                        Node temp = head;
                        Node ptr =temp.next;
                        System.out.println("Enter the data of the location which u want to delete: ");
                        dataloc = sc.nextInt();
                        while(ptr.data!=dataloc){
                            temp = ptr;
                            ptr = ptr.next;
                        }
                        temp.next = ptr.next;
                        ptr.next.prev = temp;
                }
            }
            System.out.println("Do you want to delete more data? If 'Yes' press 1");
            s = sc.nextInt();
        }while(s==1);
    }


    public static void main(String[] args) {
        Doubly_LL_Deletion x1 = new Doubly_LL_Deletion();
        x1.creation();
        x1.traverse();
        x1.deletion();
        x1.traverse();
    }
}
