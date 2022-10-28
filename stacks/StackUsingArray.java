import java.util.*;
class StackUsingArray{
    public static void main(String[] args){
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println("removed : "+stack.pop());
        System.out.println("removed : "+stack.pop());
        System.out.println(stack.isEmpty());
        System.out.println("peek element:"+stack.peek());
        stack.printStack();
    }
}
class Stack{
    int[] arr = new int[100];
    int top = -1;
    public boolean isEmpty(){
        if(top < 0){
            return true;
        }
        return false;
    }
    public void push(int data){
        if(top > 100){
            return;
        }
        top++;
        arr[top] = data;
    }
    public int pop(){
        if(top < 0){
            return -1;
        }
        int ans = arr[top];
        top--;
        return ans;
    }
    public int peek(){
        return arr[top];
    }
    public void printStack(){
        for(int counter=top;counter>=0;counter--){
            System.out.println(arr[counter]);
        }
    }
}
