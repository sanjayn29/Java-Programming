class node{

    int data;
    node next;
    node(int data){
        this.data=data;
        this.next=null;
    }

}
class linkedlistcode {
    node head;
    linkedlistcode(){
        this.head=null;
    }

    void insertstart(int data){
        node newnode = new node(data);
        newnode.next = head;
        head = newnode;
    }

    void insertend(int data){
        node newnode = new node(data);
        node curr = head;
        while(curr.next != null){
            curr=curr.next;
        }
        curr.next = newnode;
    }

    void insertmiddle(int data,int pos){
        node newnode = new node(data);
        node curr = head;
        for(int i=1;i<pos-1;i++){
            curr=curr.next;
        }
        newnode.next=curr.next;
        curr.next=newnode;
    }

    void deletestart(){
        head = head.next;
    }

    void deleteend(){
        node curr = head;
        while(curr.next.next != null){
            curr = curr.next;
        }
        curr.next = null;
    }

    void deletemiddle(int pos){
        node curr = head;
        for(int i=1;i<pos-1;i++){
            curr=curr.next;
        }
        curr.next=curr.next.next;
    }

    void printlist(){
        node cur = head;
        while (cur != null){
            System.out.print(cur.data+"->");
            cur=cur.next;
        }
        System.out.println("Null");
    }
}

public class main{
    public static void main(String[] args){
        linkedlistcode l1 = new linkedlistcode();
         // Insert at START
        l1.insertstart(30);
        l1.insertstart(20);
        l1.insertstart(10);

        System.out.println("After insert at start");
        l1.printlist();


        // Insert at END
        l1.insertend(40);
        l1.insertend(50);
        l1.insertend(60);

        System.out.println("After insert at end");
        l1.printlist();


        // Insert at MIDDLE
        l1.insertmiddle(35, 4);
        l1.insertmiddle(36, 5);

        System.out.println("After insert at middle");
        l1.printlist();


        // Delete at START
        l1.deletestart();

        System.out.println("After delete at start");
        l1.printlist();


        // Delete at END
        l1.deleteend();

        System.out.println("After delete at end");
        l1.printlist();


        // Delete at MIDDLE
        l1.deletemiddle(3);

        System.out.println("After delete at middle");
        l1.printlist();
    }
}
