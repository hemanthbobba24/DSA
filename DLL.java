import java.util.*;
  class DLL{
    public static void main(String[] args){
        DoublyLinkedList list = new DoublyLinkedList();
        list.addFirst(12);
        list.addFirst(13);
        list.addLast(18);
        list.addLast(19);
        list.insertAtIndex(22,3);
        list.insertAtIndex(23,5);
        list.printList();
        // System.out.println(list.deleteFirst());
        // list.printList();
        // System.out.println(list.deleteLast());
        // list.printList();
        // System.out.println(list.deleteAtGiven(2));
        // list.printList();
        System.out.println();
        System.out.println(list.search(13));
    }
}
class DoublyLinkedList{
    class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    Node head;
    int size;
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            size++;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
        size++;
    }
    public void addLast(int data){
        if(head == null){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        Node curNode = traverse();
        
        curNode.next = newNode;
        newNode.prev = curNode;
        size++;
    }
    public Node traverse(){
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        return temp;
    }
    public void insertAtIndex(int data, int index){
        if(index > size){
            return;
        }
        if(index == size){
            addLast(data);
            return;
        }
        if(index == 0){
            addFirst(data);
            return;
        }
        Node temp = traverseAtGiven(index);
        Node newNode = new Node(data);
        Node nextNode = temp.next;
        temp.next = newNode;
        newNode.prev = temp;
        
        newNode.next = nextNode;
        nextNode.prev = newNode;
        
        size++;
    }
    public Node traverseAtGiven(int index){
        Node temp = head;
        for(int i=1;i<index;i++){
            temp = temp.next;
        }
        return temp;
    }
    public int deleteFirst(){
        if(head == null){
            return -1;
        }
        int ans = head.data;
        head = head.next;
        size--;
        return ans;
    }
    public int deleteLast(){
        if(head == null){
            return -1;
        }
        Node temp = traverseAtGiven(size);
        int ans = temp.data;
        temp.prev.next = null;
        size--;
        return ans;
    }
    public int deleteAtGiven(int index){
        if(head == null){
            return -1;
        }
        if(index == 0){
            return deleteFirst();
        }
        if(index == size){
            return deleteLast();
        }
        Node temp = traverseAtGiven(index);
        int ans = temp.next.data;
        Node nextNode = temp.next.next;
        temp.next = nextNode;
        nextNode.prev = temp;
        size--;
        return ans;
    }
    public int search(int target){
        Node temp = head;
        if(head == null){
            return -1;
        }
        int i=0;
        while(i<size){
            if(temp.data == target){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }
    public void printList(){
        Node temp = head;
        for(int i=0;i<size;i++){
            System.out.print(temp.data+"-><-");
            temp = temp.next;
        }
        System.out.print("end");
    }
}
