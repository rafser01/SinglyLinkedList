/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rakin.javaquiz;

/**
 *
 * @author user2
 */
public class IntLinkedList {
    Node head;
    class Node{
        int data;
        Node next;

        Node(int data) {
            this.data=data;
        }
        
    }
    
    
     // Question Answer 1;
    public IntLinkedList insert(IntLinkedList list, int data) {
        Node newNode=new Node(data);
        newNode.next=null;
        
        
        // If the Linked List is empty, then make the new node as head 
        if (list.head == null) { 
            list.head = newNode; 
        } else {
            Node last = list.head;
            while (last.next != null) {   
                // Swaping next to head
                last = last.next;
            };
            // Insert the newNode at last node 
            last.next = newNode;
        }
        return list;
    };
    
    // Question 2:
    public Node deleteTail(Node list) {

        if (list == null || list.next == null) return null;
        Node node = list;
        while(node.next.next != null) {
            node = node.next;
        }

        node.next = null;
        return list;
    }
    
    // Question 3:
    public Node removeElements(Node head, int val) {
        Node helper = new Node(0);
        helper.next = head;
        Node p = helper;

        while(p.next != null){
            if(p.next.data > val){
                Node next = p.next;
                p.next = next.next; 
            }else{
                p = p.next;
            }
        }

        return helper.next;
    }
    
    public void printList(String msg,IntLinkedList list) { 
        Node currNode = list.head; 
  
        System.out.println(msg+"IntLinkedList: "); 
  
        // Print list item  till found null
        while (currNode != null) { 
            // Print the data at current node 
            System.out.print(currNode.data + " "); 
  
            // Go to next node 
            currNode = currNode.next; 
        } 
        System.out.println("\n");
    }
    
    
}
