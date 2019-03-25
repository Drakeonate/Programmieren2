package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Das ist eine JUnit-Test Klasse, die die Methoden der Klasse Person testet
 * @author Stephi
 *
 */
class PersonTest {


	/*
	 * ------------ WICHTIG ------------
	 * Um eine Methode als JUnit-Test verwenden zu koennen, muss sie mit @Test gekennzeichnet sein! 
	 * Sonst wird der Test nicht ausgefuehrt
	 * ------------ WICHTIG ENDE ------------
	 * 
	 * Die Test-Methode bloodTypeTest testet, ob die Blutgruppe richtig uebernommen wird. 
	 * Der Getter sollte in diesem Fall immer den Wert zurueckgeben, der mit dem Setter gesetzt wird.
	 * 
	 */
	@Test
	void bloodTypeTest() {
		Person person = new Person("Annika", "Peters");
		String bloodType = "0-positive";
		person.setBloodType(bloodType);

		assertEquals(bloodType, person.getBloodType());
	}

	/*
	 * Da die Methode setHairColor nur Haarfarben annimmt, die aus Buchstaben bestehen sollte Gruen gesetzt werden, 
	 * Blau241E aber nicht, da dort Zahlen enthalten sind. In diesem Fall moechte man testen, 
	 * ob der gesetzte Wert NICHT dem Wert von getHairColor ist
	 */
	@Test
	void hairColorTest() {
		Person person = new Person("Annika", "Peters");
		String hairColor = "Gruen";
		person.setHairColor(hairColor);
		assertEquals(hairColor, person.getHairColor());
		
		
		//Teste eine Zahl
		String hairColor2 = "Blau241E";
		person.setHairColor(hairColor2);
		//hairColor2 sollte nicht gesetzt werden, deswegen assertNotEquals
		assertNotEquals(hairColor2, person.getHairColor());
	}
	
	
}
