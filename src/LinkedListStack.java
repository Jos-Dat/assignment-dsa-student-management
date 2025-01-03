import java.util.EmptyStackException;

class LinkedListStack {
    private Node top;  // Top element of the stack

    public LinkedListStack() {
        this.top = null; // Start with an empty stack
    }

    public void push(Student student) {
        Node newNode = new Node(student);
        newNode.next = top; // Point the new node to the current top
        top = newNode;      // Update the top to be the new node
        System.out.println("Added " + student + " to the stack.");
    }

    public Student pop() {
        if (top == null) {
            System.out.println("Stack is empty. Cannot pop.");
            throw new EmptyStackException();
        } else {
            Student poppedValue = top.data; // Store the value to return
            top = top.next;                  // Update the top to the next node
            return poppedValue;
        }
    }

    public Student peek() {
        if (top == null) {
            System.out.println("Stack is empty. Nothing to peek.");
            throw new EmptyStackException();
        } else {
            return top.data; // Return the value of the top node
        }
    }

    public boolean isEmpty() {
        return top == null;
    }

    public static void main(String[] args) {
        LinkedListStack stack = new LinkedListStack();
        // Sample students
        Student s1 = new Student(1, "Alice", 8.5);
        Student s2 = new Student(2, "Bob", 6.0);

        stack.push(s1);
        stack.push(s2);
        System.out.println("Top student: " + stack.peek());
        System.out.println("Popped: " + stack.pop());
        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}