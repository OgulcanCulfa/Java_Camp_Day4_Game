package day4_odev_game.Entities;


public class Gamer {
	public String TcNo;
	public String firstname;
	public String surname;
	public String yearOfBirth;
	
	public String getTcNo() {
		return TcNo;
	}
	public void setTcNo(String tcNo) {
		TcNo = tcNo;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getYearOfBirth() {
		return yearOfBirth;
	}
	public void setYearOfBirth(String yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}
	
}
