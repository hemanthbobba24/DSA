import java.util.*;
class StackImplementationUsingLL{
    public static void main(String[] args){
        Stack stack = new Stack();
        stack.push(10);
        stack.push(12);
        stack.push(14);
        stack.push(18);
        System.out.println("removed:" +stack.pop());
        stack.printStack();
        System.out.println("peek element:"+stack.peek());
        System.out.println(stack.isEmpty());
    }
}

class Stack{
    public class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    Node head;
    int size;
    public boolean isEmpty(){
        if(head == null){
            return true;
        }
        return false;
    }
    public void push(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            size++;
            return;
        }
        newNode.next = head;
        head = newNode;
        size++;
    }
    public int pop(){
    if(head == null){
        return -1;
    }
      int ans = head.data;
      head = head.next;
      size--;
      return ans;
    }
    public int peek(){
        if(head == null){
            return -1;
        }
        return head.data;
    }
    public void printStack(){
        Node temp = head;
        for(int i=0;i<size;i++){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
