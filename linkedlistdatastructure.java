class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }

}
class linkedlist{
    int size;
    Node head;
    Node tail;
    int get(int indx){
        Node Temp=head;
        for(int i=1;i<=indx;i++){
            Temp=Temp.next;
        }
        return Temp.data;
    }
    void deleteatpos(int indx){
        
        Node Temp =head;
        for(int i = 1; i<= indx-1; i++){
            Temp=Temp.next;
        }
        Temp.next=Temp.next.next;
        if(indx==size-1){
            tail=Temp;
            size--;
        }

        }
    
    void insertatpos(int indx,int val){
        Node Temp=head;
        for(int i=1; i<indx-1;i++){
            Temp = Temp.next;
        }
        Node t = new Node(val);
        t.next=Temp.next;
        Temp.next=t;
    }
    void searchelement(int value){
        Node Temp=head;
        int indx=0;
        while(Temp.data!=value){
            indx++;
            Temp=Temp.next;

        }
        System.out.println(indx);
    }
    void countnoofnodes(){
        Node Temp=head;
        int count=0;
        while(Temp!=null){
            count++;
            Temp=Temp.next;
        }
        System.out.println(count);
            
           

 
            

        }
    

    void insertatend( int val){
        Node Temp = new Node(val);
         if(tail==null) head =tail=Temp;
         else{
            tail.next=Temp;
            tail=Temp;
         }
         }
         void deleteathead(){
            if(head==null){
                System.out.println("linkedlist is empty");
            }
            head=head.next;
         }

         
         void display(){
            Node Temp=head;
            while(Temp!=null){
                 System.out.println(Temp.data+ " ");
                 Temp=Temp.next;
                
            }
           
         }


        }
public class linkedlistdatastructure {
    public static void main(String[] args) {
        linkedlist l1 = new linkedlist();
        l1.insertatend(10);
        l1.insertatend(30);
        l1.insertatend(40);
        l1.insertatend(50);
        l1.insertatpos(2,20);
        l1.countnoofnodes();
        l1.searchelement(20);
        l1.deleteatpos(1);
         l1.display();
       
        
    }
    
}
