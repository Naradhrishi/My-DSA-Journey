class Main{
  public static void main(String args[]){
      // main code here
      
  
 }
    public void printList(Node head){
     Node curr = head;
     while(curr != null){
       System.out.print(curr.val +" -> ");
       curr = curr.next;
     }
    }
    public Node insertAtHead(Node head, int val){
        Node temp = new Node(val, head);
        head = temp;
        return head;
    }
    public Node insertAtEnd(Node head, int val){
        Node curr = head;
        Node temp = new Node(val);
        if(curr == null){
            head = temp;
        }
        while(curr != null && curr.next != null){
            curr = curr.next;
        }
        curr.next = temp;
        return head;
    }
    public Node deleteNode(Node head, int val){
        Node curr = head;
        Node prev = null;
        if(curr == null){
            System.out.println("No such Node exist!");
            return null;
        }
        while(curr != null){
            if(curr.next == null){
                head = null;
            }
        }
    }
    
 }
}


class Node{
  int val;
  Node next;
  
  Node(int val){
    this.val = val;
    this.next = null;
  }
  Node(int val, Node next){
    this.val = val;
    this.next = next;
  }
  
}


