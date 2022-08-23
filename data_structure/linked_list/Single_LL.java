package data_structure.linked_list;

import java.util.Scanner;

public class Single_LL {
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
        int data,n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter data: ");
            data = sc.nextInt();
            Node new_node = new Node(data);
            if (head == null) {
                head = new_node;
            } else {
                new_node.next = head;
                head = new_node;
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
            while(temp!=null){
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        Single_LL s1 = new Single_LL();
        s1.creation();
        s1.traverse();
    }
}
