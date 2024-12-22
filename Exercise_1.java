class Stack { 
    //Please read sample.java file before starting.
    //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack


    Stack()
    {
        //Initialize your constructor
        top = -1;
    }

    boolean isEmpty()
    {
        //Write your code here
        return top == -1;
    }

    boolean push(int x)
    {
        //Check for stack Overflow
        if(top == a.length-1) {
            System.out.println("Stack is overflow");
            return false;
        }
        //Write your code here
        top++;
        a[top] = x;
        return  true;

    }

    int pop() {
        //If empty return 0 and print " Stack Underflow"
        if(isEmpty()) {
            System.out.println("Stack is underflow");
            return -1;
        }
        //Write your code here
        int poppedElement = a[top];
        top--;
        return poppedElement;
    }

    int peek()
    {
        //Write your code here
        if(isEmpty()){
            return  -1;
        }
        return a[top];
    }
}
