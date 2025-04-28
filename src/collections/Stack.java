package collections;

import java.util.Arrays;

public class Stack {

    private int maxSize;
    private int[] arr;
    private int top;

    public Stack(int size){
        this.maxSize = size;
        this.arr = new int[maxSize];
        this.top = -1;
    }

    public void push(int value){
        if(top == maxSize-1){
            System.out.println("Stack is full");
            return;
        }
        arr[++top] = value;
    }

    public int pop(){
        if(top==-1){
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top--];
    }

    public int peek(){
        if(top==-1){
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top];
    }

    public static void main(String[] args) {
        Stack stack = new Stack(3);

        stack.push(9);
        stack.push(5);
        stack.push(3);
        stack.push(4);
        stack.pop();
        stack.pop();
        //stack.pop();

        System.out.println(Arrays.toString(stack.arr));
        System.out.println(stack.peek());
    }
    
}
