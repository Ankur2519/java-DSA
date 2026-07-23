package LinkedList;
class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }
}
class LinkedList{
    Node head;
    Node tail;
    public  void addathead(int val){
        Node temp = new Node(val);
        if(head==null){
            head=tail=temp;
        }
        else{
        temp.next = head;
        head = temp;
        }
    }
    public void addattail(int val){
        Node temp = new Node(val);
        if(tail==null){
            tail=head=temp;
        }
        else{
        tail.next=temp;
        tail = temp;
        }
    }
        public void displayLinkedlist(){
            Node temp = head;
            while(temp!=null){
                System.out.println(temp.val);
                temp = temp.next;
            }

        }
    }


public class Basics {
    public  static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.addattail(10);
        l1.addattail(20);
        l1.addattail(36);
        l1.addathead(67);
        l1.addathead(68);
        l1.displayLinkedlist();
    }
    
    
}
