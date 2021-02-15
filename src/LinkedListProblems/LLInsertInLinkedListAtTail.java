package LinkedListProblems;

public class LLInsertInLinkedListAtTail {
    public static class SinglyLinkedListNode {
        int data;
        SinglyLinkedListNode next;
    }

// trebuie traversat linked list-ul pana la final si odata ce ajungem la final il adaugam nod-ul.

 public static SinglyLinkedListNode insertNodeAtTail (SinglyLinkedListNode head , int value) {

     if (head == null) {
         // daca linkedlist-ul este null atunci linkedlist-ul este gol si vom da valoarea direct head-ului.
         head = new SinglyLinkedListNode();
         head.data = value;

     } else {
         SinglyLinkedListNode  newNode = new  SinglyLinkedListNode();
         newNode.data =value;
         SinglyLinkedListNode currentNode = head;

         while (currentNode.next != null) { // trebuie sa mergem pana la nod-ul
             // dinaintea ultimului nod ca altfel am seta next-ul null-ului
             currentNode = currentNode.next;
         } // traversez pana la final
         currentNode.next = newNode; //setez nex-ul ultimului nod ca valoarea ceruta.

     }
     return head;
 }
}
