
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.List;

public class HotelManagement {

    Hotel hotel;

    public HotelManagement() { // initializing and accessing one single Hotel object across all the classes

        hotel = Hotel.getInstance();
    }

    public boolean booking(Customer c, Calendar startDate, Calendar endDate, String roomtype, boolean view) {

        Room room = hotel.findSpecificRoom(startDate, endDate, roomtype, view, c); //finds and returns the matching criteria room
        if (room != null) {
            Book newBooking = new Book(room, startDate, endDate, c);
            c.setBookingInfo(newBooking);
            c.setIsBooked(true);//book is assigned both to customer and to the hotel
            hotel.getBookingList().add(newBooking);
            return true;
        } else {
            return false;
        }
    }

    public boolean checkIn(Book bookingInfo, Calendar checkInDate) {

        if (checkInDate.before(bookingInfo.getStartDate()) || checkInDate.after(bookingInfo.getEndDate())) { // if customer arrives earlier it is not allowed
            return false;
        } else {
            // when normal or late but not exceeding end date
            return true;
        }
    }

    public void checkOut(Book bookingInfo, Calendar checkOutDate) {

        long amountOfDays = ChronoUnit.DAYS.between(bookingInfo.getStartDate().toInstant(),
                bookingInfo.getEndDate().toInstant());
        // room.getPrice returns one night's price so , it is multiplied with amount of nights stayed to create one full bill
        Bill hotelBill = new Bill("Room Cost for " + amountOfDays + " days",
                (bookingInfo.getRoom().calculatePrice()) * amountOfDays, checkOutDate.getTime(), false);
        bookingInfo.getCustomer().getBillList().add(hotelBill);
        bookingInfo.getCustomer().setIsCheckedIn(false);
        bookingInfo.getCustomer().setBookingInfo(null);
        bookingInfo.getCustomer().setIsBooked(false);

    }

    public <E extends Person> E logIn(User user, List<E> list) {

        for (E e : list) {
            if (e.getUserInfo().getUserName().equals(user.getUserName()) && e.getUserInfo().getPassword().equals(user.getPassword())) {
                return e;
            }
        }
        return null;

    }
}
