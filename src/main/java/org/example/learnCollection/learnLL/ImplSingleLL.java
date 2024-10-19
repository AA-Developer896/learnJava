package org.example.learnCollection.learnLL;

public class ImplSingleLL {

    Node head;
   ImplSingleLL() {
       head = null;
   }
//Abhi
    public void insert(ImplSingleLL list, int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
        } else {
            Node tempNode = head;
            while(tempNode.next != null) {
                tempNode = tempNode.next;
            }
            tempNode.next = newNode;
        }


    }

    public void removeLastNode() {
       Node tempNode = head;
       if(tempNode != null) {
           if(tempNode.next == null) {
               head = null;
           }
           while(tempNode.next.next != null) {
               tempNode = tempNode.next;
           }
           tempNode.next = null;
       }
    }

    public void printLL() {
       Node tempNode = head;
       while(tempNode != null) {

           System.out.println(tempNode.data);
           tempNode = tempNode.next;
       }

    }

    public static void main(String args[]) {

       ImplSingleLL linkedList = new ImplSingleLL();

       linkedList.insert(linkedList,5);
       linkedList.insert(linkedList,7);
       linkedList.insert(linkedList,98);
       linkedList.insert(linkedList,2);



       linkedList.printLL();
       linkedList.removeLastNode();
        linkedList.printLL();
       System.out.print("Piru");

    }
}
