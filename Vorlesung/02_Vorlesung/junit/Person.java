package junit;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Person {
	
	private String firstName;
	private String lastName;
	private int age;
	private String hairColor;
	private String bloodType;
	
	
	
	public Person(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getHairColor() {
		return hairColor;
	}
	
	//Wir wollen nur Haarfarben zulassen, die ausschliesslich aus Gross und Kleinbuchstaben bestehen
	public void setHairColor(String hairColor) {
		//^ 		-> schau den String ab den Zeilenanfang an
		//[a-zA-Z] 	-> nur Klein und Grossbuchstaben
		//+			-> mindestens ein Buchstabe
		//$ 		-> schau den String bis zum Zeilenende an
		Pattern pattern = Pattern.compile("^[a-zA-Z]+$");
	
		//Wende das Pattern oben auf den Parameter hairColor an
		Matcher matcher = pattern.matcher(hairColor);

		//true -> wenn es die uebergebene Haarfarbe nur Gross und Kleinbuchstaben hat
		if(matcher.find()) {
			this.hairColor = hairColor;			
		}
		
	}
	public String getBloodType() {
		return bloodType;
	}
	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}
	
	
	

}
