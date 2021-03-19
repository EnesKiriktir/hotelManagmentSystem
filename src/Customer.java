
import java.util.ArrayList;
import java.util.List;

public class Customer extends Person {

    private List<Bill> billList = new ArrayList<>();
    private boolean isCheckedIn;
    private Book bookingInfo;
    private static int idCounter = 0;
    private boolean isBooked;

    public Customer(String firstName, String lastName, Address address, String phone, String email,
            User userInfo, Book bookingInfo) {
        super(firstName, lastName, address, phone, email, userInfo);
        this.setId(++idCounter);
        this.bookingInfo = bookingInfo;
        this.isBooked = false;
        this.isCheckedIn=false;

    }

    public List<Bill> getBillList() {
        return billList;
    }

    public void setBillList(List<Bill> billList) {
        this.billList = billList;
    }

    public Book getBookingInfo() {
        return bookingInfo;
    }

    public void setBookingInfo(Book bookingInfo) {
        this.bookingInfo = bookingInfo;
    }

    public String toString() {
        return "Customer Id: " + getId() + " Name: " + getFirstName() + " " + getLastName();
    }

    public boolean IsBooked() {
        return isBooked;
    }

    public void setIsBooked(boolean isBooked) {
        this.isBooked = isBooked;
    }

    
    public boolean IsCheckedIn() {
        return isCheckedIn;
    }

    
    public void setIsCheckedIn(boolean isCheckedIn) {
        this.isCheckedIn = isCheckedIn;
    }
}
