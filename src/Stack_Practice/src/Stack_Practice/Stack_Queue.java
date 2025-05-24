Stack implementation:-
    
package Stack_Practice;

public class Stack {
    private Linkedlist lis;

    public Stack(){
        lis = new Linkedlist();
    }

    //stack operations : push,pop,peek,isEmppty

    void push(int val){
        lis.addElement(val);           // push operation
    }

    void pop(){
        lis.shifttonextElement();     // pop operation
    }

    int peek(){
        return lis.headOfTheLinkedList();      // return top of the stack
    }

    boolean isEmpty(){
        return lis.isEmpty();
    }
}

Queue implementation:-

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

