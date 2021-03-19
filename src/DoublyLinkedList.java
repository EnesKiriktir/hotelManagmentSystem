
import java.util.Calendar;

public class DoublyLinkedList {
	Node head,tail;
	
	//this dll places new nodes in ascending date order
	public boolean insert(Calendar date1,Calendar date2,Customer customer) {
		
		Node newNode = new Node(date1,date2,customer);
		if(head==null) { // if there is no elements in the dll
			head=newNode;
			tail=newNode;
			
		}
		else if(head.startDate.after(date2)) { //if new node fits before of head node
			newNode.next = head; 
            newNode.next.prev = newNode; 
            head = newNode; 
		}
		else if(tail.endDate.before(date1)) {// if new node fits after of tail node
			tail.next=newNode;
			newNode.prev = tail;
			tail=newNode;
			
		}
		else { //if new node fits somewhere in between head and tail
				//it iterates until fitting place is found
			boolean isFit=false;
				Node current = head;
				while(current.next!=null && current.next.startDate.before(date2)) {
					current = current.next;
				}
				if(current.endDate.before(date1)) {
					newNode.prev=current;
					newNode.next=current.next;
					current.next.prev = newNode;
					current.next = newNode;
					isFit=true;
	
				}
				if(!isFit) {
					return false;
				}
			
			
		}
		return true;
	}
	
	public void printList() {
		Node current = head;
		while(current!=null) {
			System.out.println((current.startDate).getTime()+" "+(current.endDate).getTime());
			current = current.next;
		}
	}
}
