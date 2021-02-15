package LinkedListProblems;

public class LLInserInLinkedListAtPosition {
    public static class SinglyLinkedListNode {
        int data;
        SinglyLinkedListNode next;
    }

    //Logica cod:
//    if (position ==0){
//        --create node
//        -- set value
//        return
//    } else {
//    --create node
////  -- set value
//    Iterate till previous node to position, and change nodes next
//    }
//
    public static SinglyLinkedListNode InsertAtPosition (SinglyLinkedListNode head, int value, int position){
        SinglyLinkedListNode newNode = new SinglyLinkedListNode();
        newNode.data = value;
        if (position == 0) {
            newNode.next = head;

            return newNode;

        } else {
            SinglyLinkedListNode currentNode = head; // am creat un nod pt traversare care initial pointeaza la primul nod
            // este ca un iterator;
            int counter = 1; // pt ca incepem de la head
            // parcurgem pana in pozitia la care vrem sa inseram.
            while (counter < position || currentNode != null){
                currentNode = currentNode.next;
                counter++;
            }
            newNode.next = currentNode.next;
            currentNode.next = newNode;


        }
//          1   2 10  3   4   5
    return newNode;
    }

}
