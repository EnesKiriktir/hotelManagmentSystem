import java.util.Calendar;

public class Employee extends Person {

	private boolean isAdmin;
        private static int idCounter=0;
	
	public Employee(String firstName, String lastName, Address address, String phone, String email,
			User userInfo,boolean isAdmin) {
		
		super(firstName, lastName, address, phone, email, userInfo);
		this.isAdmin = isAdmin;
                this.setId(++idCounter);
	}
	public boolean isAdmin() {
		return isAdmin;
	}
	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	
}
