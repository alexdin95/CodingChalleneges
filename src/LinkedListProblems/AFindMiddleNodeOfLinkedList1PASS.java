package LinkedListProblems;

import java.util.LinkedList;

public class AFindMiddleNodeOfLinkedList1PASS {

    static class LinkedList {

        Node head; //Head-ul LinkedList-ului;

        /* Linked list node */
        class Node {
            int data;
            Node next;


            Node(int data) {
                this.data = data;
                next = null;
            }
        }

        void printMiddle() {
            Node slowPointer = head;
            Node fastPointer = head;
            if (head != null) {

                while (fastPointer != null && fastPointer.next != null) { // daca el este null sau urmatorul este null insemana ca a ajuns la sfarssit deci se poate oprii
                    // de aceea nu ma intereseaza ce valoare are fasPointer.next.next in while
                    fastPointer = fastPointer.next.next;
                    slowPointer = slowPointer.next;

                    System.out.println("The middle node is " + slowPointer.data);
                }
            }
        }

        public void push(int new_data) {
        /* 1 & 2: Allocate the Node &
                  Put in the data*/
            Node new_node = new Node(new_data);

            /* 3. Make next of new Node as head */
            new_node.next = head;

            /* 4. Move the head to point to new Node */
            head = new_node;

            // practic cu implementarea asta fac head-ul sa fie noul nod pt ca ii atribui valoarea.
        }

        public void push2(int newData) { // gresit.
            Node newNode = new Node(newData);
            newNode = head.next;
            head.next = newNode;
        }

        public void printList() {
            Node tnode = head;
            while (tnode != null) {
                System.out.print(tnode.data + "->");
                tnode = tnode.next;
            }
            System.out.println("NULL");
        }
    }

    public static void main(String[] args) {
        LinkedList llist = new LinkedList();
        for (int i = 5; i > 0; --i) {
            llist.push(i);
            llist.printList();
            llist.printMiddle();
            
        }
    }
}

