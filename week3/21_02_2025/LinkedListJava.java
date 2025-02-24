/**
 * ==========================================================
 * Program Name: LinkedListJava
 * Description : 
 * Author      : Keshav Abhishek
 * Created On  : 21-02-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
 */

 public class LinkedListJava {
    LinkedListJava prev;
    int data;
    LinkedListJava next;

    LinkedListJava() {}

    LinkedListJava(int value) {
        this.data = value;
    }

    LinkedListJava(LinkedListJava preNode, int value, LinkedListJava nextNode) {
        this.prev = preNode;
        this.data = value;
        this.next = nextNode;
    }

    // Method to add a node at the end of the list
    public void addNode(int value) {
        LinkedListJava newNode = new LinkedListJava(value);
        LinkedListJava current = this;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        newNode.prev = current;
    }

    // Method to print the list
    public void printList() {
        LinkedListJava current = this;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedListJava head = new LinkedListJava(1);
        head.addNode(2);
        head.addNode(3);
        head.addNode(4);

        head.printList(); // Output: 1 2 3 4
    }
}