package com.thaivv2004110036.tuan7;

public class LinkedList {
    Node head = null;
    Node tail = null;


void add(int data) {
    Node newNode = new Node(data);
    if(head == null) {
        head = newNode;
        tail = newNode;
    } else {
        tail.next = newNode;
        tail = newNode;
    }

}

 void print() {
    Node current = head;
    if(head == null) {
        System.out.println("Danh sách rỗng.");
    }
    
    System.out.println("Các nút trong danh sách: ");
    while(current != null) {
        System.out.println(current.data);
        current = current.next;
    }
}

}