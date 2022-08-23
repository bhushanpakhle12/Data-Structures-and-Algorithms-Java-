package data_structure.linked_list;

import java.util.Scanner;

public class Single_LL_Deletion {

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head=null;

    public void creation(){
        int data,n,w;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter data: ");
            data = sc.nextInt();
            Node new_node = new Node(data);
            if (head == null)
            {
                head = new_node;
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
                        break;
                    case 2:
                        Node check=head;
                        while(check.next!=null){
                            check = check.next;
                        }
                        check.next = new_node;
//                        new_node.next = null;
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
            while(temp!=null){
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    public void deletion(){
        int data,n,w;
        Scanner sc = new Scanner(System.in);
        do {
            if (head == null)
            {
                System.out.println("Linked List doesn't exists.");
            }
            else {
                System.out.println("Enter 1 to delete the item at the beginning, 2 to delete the item " +
                        "at the end, 3 to delete the item at any specific location");
                w = sc.nextInt();
                switch (w)
                {
                    case 1:
                        head = head.next;
                        break;
                    case 2:
                        Node temp=head;
                        Node ptr=temp.next;
                        while(ptr.next!=null){
                            temp=ptr;
                            ptr=ptr.next;
                        }
                        temp.next=null;
                        break;
                    case 3:
                        int delloc;
                        Node temploc=head;
                        Node ptrloc=temploc.next;
                        System.out.println("Enter the data of the location which you want to delete:");
                        delloc = sc.nextInt();
                        while(ptrloc.data!=delloc){
                            temploc = ptrloc;
                            ptrloc = ptrloc.next;
                        }
                        temploc.next=ptrloc.next;
                        break;
                }
            }
            System.out.println("Do you want to delete more data?If 'Yes' press 0: ");
            n = sc.nextInt();
        }
        while(n==0);

    }

    public static void main(String[] args) {
        Single_LL_Deletion s3 = new Single_LL_Deletion();
        s3.creation();
        s3.deletion();
        s3.traverse();
    }
}
