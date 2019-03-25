package quiz;

public class GamePlay {

	//strg + Leertaste -> autogenerate
	//rechte Maustaste -> Source -> Generate Getter/Setter/Konstruktoren
	//Strg + 7 -> ein und auskommentieren
	public static void main(String[] args) {
		
//		GeneralQuestion generalQuestion = new GeneralQuestion("Bla?", "Oh, ja, bla!");
//
//		GeneralQuestion generalQuestion2 = new GeneralQuestion("Ist das nicht toll?", 
//				"Ja, das ist toll", false, true);
		
		
		MultipleChoiseQuestion question = new MultipleChoiseQuestion("Was geht?", "Nix mit x");
		int anzahl = 4;
		String [] funAnswers = new String[anzahl];
		funAnswers[0] = "Alles";
		funAnswers[1] = "Blaa";
		funAnswers[2] = "Test";
		funAnswers[3] = "Alles mit Beinen";
		
		//Variante 2, das Array ist mit dem ersten identisch
		String [] funAnswers2 = {"Alles", "Blaa", "Test", "Alles mit Beinen"};
//		for(int i = 0; i < funAnswers.length; i++) {
//			funAnswers[i] = "Huhu";
//		}
		
		//syso = System.out.println();
		System.out.println(question.toString());
		question.setWrongAnswers(funAnswers);
		System.out.println(question);
		
	}

}
