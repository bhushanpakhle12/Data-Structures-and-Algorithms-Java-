package data_structure.linked_list;

import java.util.Scanner;

public class Circular_LL_Insertion {
        static class Node{
            int data;
            Node next;
            Node(int data){
                this.data=data;
                this.next=null;
            }
        }
        Node head=null;
        Node tail = null;

        public void insertion(){
            int data,n,w;
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
                    System.out.println("Enter 1 to insert the item at the beginning, 2 to insert the item " +
                            "at the end, 3 to insert the item at any specific location");
                    w = sc.nextInt();
                    switch (w)
                    {
                        case 1:
                            new_node.next = head;
                            head = new_node;
                            tail.next = head;
                            break;
                        case 2:
                            tail.next = new_node;
                            new_node.next=head;
                            tail = new_node;
                            break;
                        case 3:
                            int insdat;
                            Node tempins=head;
                            System.out.println("Enter the data of the location after which you want to insert new node:");
                            insdat = sc.nextInt();
                            while(tempins.data!=insdat){
                                tempins = tempins.next;
                            }
                            new_node.next=tempins.next;
                            tempins.next=new_node;
                            break;
                    }
                }
                System.out.println("Do you want to add more data?If 'Yes' press 0: ");
                n = sc.nextInt();
            }
            while(n==0);

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
            Circular_LL_Insertion s2 = new Circular_LL_Insertion();
            s2.insertion();
            s2.traverse();
        }

}
