package data_structure.linked_list;

import java.util.Scanner;

public class Circular_LL {
        static class Node{
            int data;
            Node next;
            Node(int data){
                this.data=data;
                this.next=null;
            }
        }
        Node head=null;
        Node tail=null;

        public void creation(){
            int data,n;
            Scanner sc = new Scanner(System.in);
            do {
                System.out.println("Enter data: ");
                data = sc.nextInt();
                Node new_node = new Node(data);
                if (head == null)
                {
                    head = new_node;
                    tail = new_node;
                    new_node.next = head;
                }
                else {
                    new_node.next = head;
                    head = new_node;
                    tail.next = head;
                }
                System.out.println("Do you want to add more data.If Yes, press 1.");
                n = sc.nextInt();
            }
            while(n==1);

        }
        public void traverse(){
            Node temp=head;
            if(head==null){
                System.out.println("Linked List doesn't exist.");
            }
            else {
                do {
                    System.out.println(temp.data);
                    temp = temp.next;
                }
                while(temp!=head);
            }
        }

        public static void main(String[] args) {
            Circular_LL s1 = new Circular_LL();
            s1.creation();
            s1.traverse();
        }
}
