
import java.util.Calendar;

public class Node {

    Customer customer;
    Node next;
    Node prev;
    Calendar startDate;
    Calendar endDate;

    // constructor to create a new linked list node 
    public Node(Calendar startDate, Calendar endDate, Customer customer) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.next = null;
        this.prev = null;
        this.customer = customer;
    }

}
