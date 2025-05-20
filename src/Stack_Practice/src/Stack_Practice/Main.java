package Stack_Practice;

public class Main {
    public static void main(String[] args) {
        Stack numberStack = new Stack();

        // Handling edge cases --  prints -1 as the stack is empty. ( for peek operation )
        System.out.println("Top of the stack is : "+numberStack.peek());  // in general gives error as the stack is empty

        numberStack.pop();

        // adding elements to stack
        numberStack.push(22);
        numberStack.push(23);
        numberStack.push(29);

        System.out.println("Top of the stack is : "+numberStack.peek());    // results 29
        System.out.println(numberStack.isEmpty());         // o/p : false   (as the stack is not empty)

        numberStack.pop();

        System.out.println("Top of the stack after performing pop operation is : "+numberStack.peek());   // o/p : 23
    }
}
