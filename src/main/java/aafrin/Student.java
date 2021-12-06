package aafrin;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Student {
	private int studentId;
	private String firstname;
	private String lastname;
	private String contactno;
	
@Id
	public int getStudentId() {
		return studentId;
	}


	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public String getContactno() {
		return contactno;
	}


	public void setContactno(String contactno) {
		this.contactno = contactno;
	}


	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", contactno=" + contactno + "]";
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
