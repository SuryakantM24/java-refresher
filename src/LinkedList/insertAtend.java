package LinkedList;

import java.util.Scanner;

public class insertAtend extends printList{

    public static Node insertEnd(Node head,int data){

        Node newNode=new Node(data);
        if(head==null){
            return newNode;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        return head;

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
        int data=s.nextInt();
        Node res=insertEnd(head,data);
        printLindkedList(res);

    }
}
