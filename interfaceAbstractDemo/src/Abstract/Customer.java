package Abstract;

public class Customer {
	public int id;
	public String firstName;
	public String lastName;
	public int dateOfBirth;
	public Long nationalityId;
	
	//Müþterilere ait özellikleri tutuyor.
	
	public Customer(int id, String firstName, String lastName, int dateOfBirth, long nationalityId) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.nationalityId = nationalityId;
	}


	public int getId() {
		return id;
	}


	public String getFirstName() {
		return firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public int getDateOfBirth() {
		return dateOfBirth;
	}


	public Long getNationalityId() {
		return nationalityId;
	}
	
}
