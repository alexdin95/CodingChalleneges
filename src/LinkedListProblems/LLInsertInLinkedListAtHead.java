package LinkedListProblems;

public class LLInsertInLinkedListAtHead {

    public static class SinglyLinkedListNode {
        int data;
        SinglyLinkedListNode next;
    }

    public static SinglyLinkedListNode InsertAtHead(SinglyLinkedListNode head, int value) {
        SinglyLinkedListNode newHead = new SinglyLinkedListNode(); //1. creez noul nod
        newHead.data = value; // 2. II adaug datele
        newHead.next=head; // 3. II pun next-ul, ca fiind vechiul head, astfel incat asta sa devina primul
        return newHead; // 4. il returnez



    }

}
