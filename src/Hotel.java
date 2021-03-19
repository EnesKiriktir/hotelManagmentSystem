
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Random;

public class Hotel {

    private List<Customer> customerList = new ArrayList<>();
    private List<Employee> employeeList = new ArrayList<>();
    private List<Room> roomList = new ArrayList<>();
    private List<SingleRoom> singleRoomList = new ArrayList<>();
    private List<DoubleRoom> doubleRoomList = new ArrayList<>();
    private Restaurant restaurant = Restaurant.getInstance();
    private List<Book> bookingList = new ArrayList<>();
    private static double income = 0.0;
    private int singleRoomNumber, doubleRoomNumber;
    private static Hotel hotel;

	//Singleton Pattern is used to create and access the same Hotel object, but since Hotel object has attributes it needs following methods
    //Note : this singleton pattern is unlike the others it requires two methods called together
    private Hotel(int singleRoomNumber, int doubleRoomNumber) {
        this.singleRoomNumber = singleRoomNumber;
        this.doubleRoomNumber = doubleRoomNumber;
        createRooms(singleRoomNumber, doubleRoomNumber);
        Employee emp = new Employee("Civan", "Okudan", new Address("İzmir", "Karşıyaka", "Gül sokak"), "05313113131", "abc@", new User("admin", "admin"), true);
        Customer cus = new Customer("Civan", "Okudan", new Address("İzmir", "Karşıyaka", "Gül sokak"), "05313113131", "abc@", new User("customer", "customer"), null);
        employeeList.add(emp);
        customerList.add(cus);
    }

    public static void initializeHotel(int singleRoomNumber, int doubleRoomNumber) { //object must be initialized somewhere in the project before it is called( getInstance )
        if (hotel != null) {
            throw new IllegalArgumentException("You have already initialized a hotel!");
        } else {
            hotel = new Hotel(singleRoomNumber, doubleRoomNumber);
        }
    }

    public static Hotel getInstance() { //only initialized object is allowed to return to the caller
        if (hotel == null) {
            throw new IllegalArgumentException("Please first initialize the hotel with room numbers!");
        } else {
            return hotel;
        }
    }

    public List<Book> getBookingList() {
        return bookingList;
    }

    public void setBookingList(List<Book> bookingList) {
        this.bookingList = bookingList;
    }

    public int getSingleRoomNumber() {
        return singleRoomNumber;
    }

    public void setSingleRoomNumber(int singleRoomNumber) {
        this.singleRoomNumber = singleRoomNumber;
    }

    public int getDoubleRoomNumber() {
        return doubleRoomNumber;
    }

    public void setDoubleRoomNumber(int doubleRoomNumber) {
        this.doubleRoomNumber = doubleRoomNumber;
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public List<Room> getRoomList() {
        return roomList;
    }

    public void setRoomList(List<Room> roomList) {
        this.roomList = roomList;
    }

    public List<SingleRoom> getSingleRoomList() {
        return singleRoomList;
    }

    public void setSingleRoomList(List<SingleRoom> singleRoomList) {
        this.singleRoomList = singleRoomList;
    }

    public List<DoubleRoom> getDoubleRoomList() {
        return doubleRoomList;
    }

    public void setDoubleRoomList(List<DoubleRoom> doubleRoomList) {
        this.doubleRoomList = doubleRoomList;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public static double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public void createRooms(int singleRoomNumber, int doubleRoomNumber) {
        //creating randomly, view or non view rooms
        Random rd = new Random();
        SingleRoom sr = null;
        DoubleRoom dr = null;
        int roomNo = 1;
        int isSeaView;
        for (int i = 0; i < singleRoomNumber; i++) {

            isSeaView = rd.nextInt(2); // decides whether a room has a sea view or not 
            if (isSeaView == 0) {
                sr = new SingleRoom(roomNo, true);
            } else {
                sr = new SingleRoom(roomNo, false);
            }

            singleRoomList.add(sr);
            roomNo++;
        }
        roomList.addAll(singleRoomList);
        for (int i = 0; i < doubleRoomNumber; i++) {

            isSeaView = rd.nextInt(2); // decides whether a room has a sea view or not 
            if (isSeaView == 0) {
                dr = new DoubleRoom(roomNo, true);
            } else {
                dr = new DoubleRoom(roomNo, false);
            }
            doubleRoomList.add(dr);
            roomNo++;
        }
        roomList.addAll(doubleRoomList);
    }

    public Room findSpecificRoom(Calendar startDate, Calendar endDate, String roomtype, boolean roomview, Customer customer) {
        //iterating each room and finding if the reservation dates fits somewhere in the room's reservation schedule
        Room tempRoom = null;
        switch (roomtype) {
            case "Double":
                for (Room r : doubleRoomList) {
                    if (r.addReservation(startDate, endDate, customer) && roomview == r.isSeaView()) {

                        tempRoom = r;
                        break;
                    }
                }
                break;
            case "Single":
                for (Room r : singleRoomList) {
                    if (r.addReservation(startDate, endDate, customer) && roomview == r.isSeaView()) {
                        tempRoom = r;
                        break;
                    }
                }
                break;
        }
        return tempRoom;
    }

    public <E extends Person> void addPerson(E e, List<E> list) {
        list.add(e);

    }

    public <E extends Person> void deletePerson(int id, List<E> list) {
        list.remove(id);
    }

    public void display(String type) {
        switch (type) {
            case "Customer":
                for (Customer c : customerList) {
                    System.out.println(c.toString());
                }
                break;
            case "Employee":
                for (Employee e : employeeList) {
                    System.out.println(e.toString());
                }
                break;
            case "Room":
                for (Room r : roomList) {
                    System.out.println(r.toString());
                }
                break;
        }
    }

}
