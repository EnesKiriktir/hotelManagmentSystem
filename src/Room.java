
import java.util.Calendar;

public abstract class Room {

	private int roomNo;
	private boolean isSeaView;
	private double price;
	//each room holds its own reservations(start-end dates) in a DLL
	private DoublyLinkedList reservationSchedule = new DoublyLinkedList();
	

	public Room(int roomNo, boolean isSeaView) {

		this.roomNo = roomNo;
		this.isSeaView = isSeaView;
		this.price = 100;
	}

	public boolean addReservation(Calendar dateStart, Calendar dateEnd, Customer customer) {
		//this method, creates each room's booking date intervals
		if (reservationSchedule.insert(dateStart, dateEnd, customer))//insert method checks if the given dates fit in or not
			return true;
		else
			return false;
	}

	public int getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}

	public boolean isSeaView() {
		return isSeaView;
	}

	public void setSeaView(boolean isSeaView) {
		this.isSeaView = isSeaView;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	
	public abstract double calculatePrice();

}
