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
