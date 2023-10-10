
public class Person {
	
	private String name;
	
	// composition relationship
	private PhoneNumber officePhone;
	
	private PhoneNumber homePhone;
	
	public Person(String name) {
		this.name = name;
	}
	
	public void setOfficePhone(PhoneNumber officePhone) {
		this.officePhone = officePhone;
	}
	
	public void setHomePhone(PhoneNumber homePhone) {
		this.homePhone = homePhone;
	}
	
	public String getOfficePhone() {
		return officePhone.toString();
	}
	
	public String getHomePhone() {
		return homePhone.toString();
	}
	

}
