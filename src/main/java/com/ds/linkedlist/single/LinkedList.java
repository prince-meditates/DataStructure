package com.ds.linkedlist.single;

public class LinkedList {

    Node head = null;
    Node tail = null;

    public void addNode(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }

    }

    public void display(){
        Node current=head;
        if(head==null){
            System.out.println("List is empty");
        }
        while(current!=null){
            System.out.println("Current Node Date :"+current.data);
            current=current.next;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.display();
    }
}

