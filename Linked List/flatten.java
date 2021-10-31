/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        Node curr=head;
        while(curr!=null){
            if(curr.child!=null){
                Node tail=findTail(curr.child);
                if(curr.next!=null){
                    curr.next.prev=tail;
                    tail.next=curr.next;
                }
                curr.child.prev=curr;
                curr.next=curr.child;
                curr.child=null;
                
            }else{
                curr=curr.next;
            }
        }
        return head;
    }
    
    public static Node findTail(Node child){
        while(child.next!=null){
            child=child.next;
        }
        return child;
    }
}
