package org.example.learnCollection.learnStack;

import java.util.*;

public class StackImpl {
   static Node head;
    public class Node {
        int data;
         Node next;

        Node(int data) {

            this.data = data;
            this.next = null;

        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    '}';
        }
    }

    public void push(int data) {
        Node newNode = new Node(data);
        if(isEmpty()) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
      //  System.out.println(" Head.next: " + head.next);
    }

    public static int peek() {
        if(head == null) return -1;
        return head.data;
    }

    public static int pop() {
        if(isEmpty()) return -1;

        int top = head.data;
        //Node temp = head;
        head = head.next;
       // temp.next = null;
        return top;


    }

    private static boolean isEmpty() {
        return head == null;
    }

    public static void main(String args[]) {
        //Stack s = new Stack();
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

       // s.printStack();

        while(!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }







    }

    private void printStack() {
        Node temp = head;
        System.out.println("temp data: " + temp.data + " temp next " + temp.next);

    }
}
