package com.rktirtho.unimansys;

// Pascal Case ============> StudentDatabase
// Class name should be Pascal case
public class Student {
	// Camel case =========
	private String firstName;
	private String middleName;
	private String lastName;

	private int roll;
	private int registrationNo;

	private String address;

	// Parameterize Constructor
	public Student(String firstName, String middleName, String lastName, int roll, int registrationNo, String address) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.roll = roll;
		this.registrationNo = registrationNo;
		this.address = address;
	}

	// Parameterize Constructor
	public Student(String firstName, String lastName, int roll, int registrationNo, String address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.roll = roll;
		this.registrationNo = registrationNo;
		this.address = address;
	}

	// No Argument Constructor
	public Student() {
		System.out.println("Student Object Has created");

	}

//	public Student() {
//		
//
//	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getRegistrationNo() {
		return registrationNo;
	}

	public void setRegistrationNo(int registrationNo) {
		this.registrationNo = registrationNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setRoll(int roll) {
		if (roll < 1) {
			System.out.println("Roll number must be more then 1");
		} else {
			this.roll = roll;
		}
	}

	public int getRoll() {
		return roll;
	}

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName + ", roll="
				+ roll + ", registrationNo=" + registrationNo + ", address=" + address + "]";
	}

}

// Snake case   first_name 

// Upper case   FIRST_NAME
