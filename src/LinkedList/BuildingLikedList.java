package LinkedList;

import java.util.Scanner;

public class BuildingLikedList {


    public static void printLindkedList(Node head){

        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    public static void main(String[] args) {

        Node head=null,tail=null;
        Scanner s=new Scanner(System.in);
        int h1=s.nextInt();
        while(h1!=-1){
            Node temp=new Node(h1);
            if(head==null){
                head=temp;
                tail=temp;
            }
            else{
                tail.next=temp;
                tail=tail.next;
            }
            h1=s.nextInt();
        }
        printLindkedList(head);

    }
}

/*
1 2 2 3 3 4

 */