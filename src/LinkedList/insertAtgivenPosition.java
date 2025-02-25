package LinkedList;

import java.util.Scanner;

public class insertAtgivenPosition  extends printList{


    public static Node insertPosition(Node head, int data,int pos){

        Node newNode=new Node(data);
        //at start
        if(pos==1){
             newNode.next=head;
             head=newNode;
             return head;
        }
        Node temp=head;
        for(int i=1;i<=pos-2;i++){
             temp=temp.next;
        }
        //pos is greater than size+1 of linked list
        if(temp==null){
            return head;
        }
        //pos within list size
        newNode.next=temp.next;
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
        int pos=s.nextInt();
        Node res=insertPosition(head,data,pos);
        printLindkedList(res);

    }
}
//start

//otheer
/*
3
k=1
        (k<=pos-2)

1 2 3 4 5 6
  h

 5    pos-2=4
 k=4     k<pos-1


1 2 3 4
      h

  pos=3

  pos-2=2
  k=2

1 2 3 4 5
  h
 */