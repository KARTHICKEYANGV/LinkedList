/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class LinkedList
{
	public static void main(String[] args) {
	    LinkedList list=new LinkedList();
	   list.insertAtBeginning(4);
	   list.insertAtBeginning(3);
	   list.insertAtBeginning(2);
	   list.insertAtBeginning(1);
	   list.insertAtPos(10,2);
	   list.insertAtEnd(19);
	   list.deleteAtBegin();
	   list.deleteAtPos(2);
	   list.deleteAtEnd();
	   list.display();
	}
	Node head;
	class Node{
	    int data;
	    Node next;
	    Node(int val){
	        data=val;
	        next=null;
	    }
	    
	}
	LinkedList(){
	        head=null;
	    }
	public void insertAtBeginning(int val){
	    Node newNode=new Node(val);
	    if(head==null) {
	        head=newNode;
	        
	    }
	    else{
	    newNode.next=head;
	    head=newNode;
	    }
	    
	}
	
	public void display(){
	    Node temp=head;
	    while(temp!=null){
	        System.out.print(temp.data+"->");
	        temp=temp.next;
	    }
	    System.out.print("null");
	}
	public void insertAtPos(int val,int pos){
	    if(head==null){
	        insertAtBeginning(val);
	    }
	    Node newNode=new Node(val);
	    Node temp=head;
	    for(int i=0;i<pos;i++){
	        temp=temp.next;
	    }
	    newNode.next=temp.next;
	    temp.next=newNode;
	}
	public void insertAtEnd(int val){
	    if(head==null){
	        insertAtBeginning(val);
	    }
	    Node newNode=new Node(val);
	    Node temp=head;
	    while(temp.next!=null){
	        temp=temp.next;
	    }
	    temp.next=newNode;
	}
	public void deleteAtBegin(){
	    if(head==null){
	        System.out.print("Empty list");
	    }
	    head=head.next;
	    if(head.next==null){
	        System.out.print("Deleted the last element");
	    }
	}
	public void deleteAtPos(int pos){
	    if(pos==0){
	        head=head.next;
	    }
	    Node temp=head.next;
	    Node prev=head;
	    for(int i=1;i<pos;i++){
	        temp=temp.next;
	        prev=prev.next;
	    }
	    prev.next=temp.next;
	    
	}
	public void deleteAtEnd(){
	    if(head==null){
	        System.out.print("Null");
	    }
	    Node temp=head;
	    while(temp.next.next!=null){
	        temp=temp.next;
	    }
	    temp.next=null;
	}
}
