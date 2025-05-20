package Stack_Practice;

public class Linkedlist {
    private ListNode head;


    boolean isEmpty() {
        return head == null;        //  checking if the linked list is empty or not
    }

    int headOfTheLinkedList() {
        if (this.isEmpty()) return -1;     // Edge case --  if stack is empty
        return head.getData();     //  return the head of the linkedlist
    }

    // adding new element to the head of the linkedlist
    void addElement(int value) {
        ListNode newNode = new ListNode(value, null);

        if (this.isEmpty()) {        // checking if linkedlist is empty. -- Edge case
            head = newNode;
        } else {
            newNode.setNext(head);
            head = newNode;
        }
    }

    void shifttonextElement(){
        if(this.isEmpty()) {
            System.out.println("Empty stack. No element to remove..!");      // Edge case
            return;
        }
        head = head.getNext();
    }
}
