
import java.util.Calendar;

public class Book {

    private Customer customer;
    private Room room;
    private Calendar startDate;
    private Calendar endDate;

    public Book(Room room, Calendar startDate, Calendar endDate, Customer customer) {
        //normal booking for the hotel with a date
        this.customer = customer;
        this.room = room;
        this.startDate = startDate;
        this.endDate = endDate;

    }

    public Book(Room room, Customer customer) {
        //without date: because user is put to reservation Queue
        this.customer = customer;
        this.room = room;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Calendar getStartDate() {
        return startDate;
    }

    public void setStartDate(Calendar startDate) {
        this.startDate = startDate;
    }

    public Calendar getEndDate() {
        return endDate;
    }

    public void setEndDate(Calendar endDate) {
        this.endDate = endDate;
    }

    public String toString() {
        return "Customer: " + getCustomer().getFirstName() + " " + getCustomer().getLastName() + " Room No: " + getRoom().getRoomNo() + " Date: " + getStartDate().getTime() + "-" + getEndDate().getTime();
    }

}
