
public class Person {
	
	private int id;
	
	private String firstName;
	private String lastName;
	private Address address;
	private String phone;
	
	private String email;
	private User userInfo;
	
	public Person(String firstName, String lastName, Address address, String phone,  String email,
			User userInfo) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.phone = phone;
		
		this.email = email;
		this.userInfo = userInfo;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public User getUserInfo() {
		return userInfo;
	}
	public void setUserInfo(User userInfo) {
		this.userInfo = userInfo;
	}
	public int getId() {
		return id;
	}
        public void setId(int id){
            this.id = id;
        }

    @Override
    public String toString() {
        return "Person{" + "firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", phone=" + phone + ", email=" + email + ", userInfo=" + userInfo + '}';
    }
	
	
}
