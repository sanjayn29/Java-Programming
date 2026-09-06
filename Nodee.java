class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class Nodee{
    public static void main(String args[]){
        Node fn = new Node(10);
        Node sn = new Node(20);
        Node tn = new Node(30);

        fn.next=sn;
        sn.next=tn;

        Node curr = fn;
        while(curr!= null){
            System.out.print(curr.data+"->");
            curr=curr.next;
        }
    }
}