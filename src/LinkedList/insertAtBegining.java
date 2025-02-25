package LinkedList;

import java.util.Scanner;

public class insertAtBegining  extends  printList{

    public static Node  insertAtBegin(Node head, int x){
        Node temp=new Node(x);
        if(head==null){
            head=temp;
            return head;
        }
        temp.next=head;
        head=temp;
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
        Node res=insertAtBegin(head,data);
        printLindkedList(res);

    }
}
