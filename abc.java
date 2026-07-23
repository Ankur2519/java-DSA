class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}
class linkedlist{
    Node head;

    void deleteathead(){
        head=head.next;
        }
        
    


   static void displaylinkedlist(Node head){
        Node Temp = head;
        while(Temp!=null){
        System.out.println(Temp.val + " ");
        Temp = Temp.next;
        }

    }
}
public class abc{
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(10);
        Node c = new Node(10);
        Node d = new Node(10);
        Node e = new Node(10);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        linkedlist.displaylinkedlist(a);
        linkedlist l1 = new linkedlist();
        l1.deleteathead();

        
    }

}
    

    

