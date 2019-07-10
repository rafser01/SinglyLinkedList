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
public class IntLinkedListMain {
    public static void main(String[] args) {
        IntLinkedList linkedList = new IntLinkedList();
        // Ans 1: Tail an int to linked list
        linkedList.insert(linkedList, 0);
        // Tail another int to linked list
        linkedList.insert(linkedList, 2);
        // Tail another int to linked list
        linkedList.insert(linkedList, 3);
        // Tail another int to linked list
        linkedList.insert(linkedList, 4);
        // Tail another int to linked list
        linkedList.insert(linkedList, 9);
        // Tail another int to linked list
        linkedList.insert(linkedList, 11);
        // Printing the linked list
        linkedList.printList("All elements ",linkedList);
        
        // Ans 2
        // Remove tail from the linked list
        linkedList.deleteTail(linkedList.head);
        // Printing the linked list
        linkedList.printList("After removing the tail ",linkedList);
        
        // Ans 3
        // Remove if target value is greater
        linkedList.removeElements(linkedList.head, 5);
        // Printing the linked list
        linkedList.printList("After removing the greater elements ",linkedList);
        
        
        
    }
}
