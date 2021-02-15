package LinkedListProblems;

public class LLPrintSinglyLinkedList {
    public class SinglyLinkedListNode {
        int data;
        SinglyLinkedListNode next;
    }

    static void printSinglyListNode(SinglyLinkedListNode head){
        SinglyLinkedListNode currentNode = head;
        while (currentNode != null){
            System.out.println( currentNode);
        }
        currentNode = currentNode.next;
    }

    public static void main(String[] args) {

    }


}
