package Stack_Practice;

public class Queue {
    private Linkedlist lis;

    public Queue(){
        lis = new Linkedlist();
    }

    // Queue operations: enqueue, dequeue, peek, isEmpty

    void enqueue(int val){
        lis.addElement(val);         // Enqueue operation (add to rear)
    }

    void dequeue(){
        lis.removeFirstElement();    // Dequeue operation (remove from front)
    }

    int peek(){
        return lis.headOfTheLinkedList();  // Return front of the queue
    }

    boolean isEmpty(){
        return lis.isEmpty();
    }
}
