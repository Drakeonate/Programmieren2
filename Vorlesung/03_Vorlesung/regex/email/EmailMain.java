package regex.email;


public class EmailMain {

	public static void main(String[] args) {
		
		Email [] emails = new Email[20];
		emails[0] = new Email("Programmieren 2 Vorlesung", "Hallo allerseits,\ndie Vorlesung morgen fällt leider aus.\nViele Grüße\nStephi");
		emails[1] = new Email("Witze", "Huhu,\nich bin gerade auf der Suche nach coolen Chuck Norris Witzen. Du kennst doch so viele. Kannst du mir mal welche schreiben?\nDas wäre mega cool :)\nLG,Tom");
		emails[2] = new Email("SRA Treffen", "Guten Tag liebe Kollegen und Kollginnen,\nheute findet der nächste Studienreformausschuss in E45 statt.\nMit freundlichen Grüßen\nMarkus Schubert");
		emails[3] = new Email("Geburtstag", "Hallo Maria, ich wollte dir alles Gute zum Geburtstag wünschen. Ich hoffe du machst dir einen schönen Tag und lässt dich ordentlich feiern.\nLiebe Grüße\nKira");
		emails[4] = new Email("Hiiillllllffffeeeeee :(", "Hallo Sina,\nich glaube ich habe einen Virus auf dem Rechner. Was soll ich tun? Kannst du dir das nachher mal anschauen? Danke und liebe Grüße\nPapa");
		emails[5] = new Email("Buch ausleihen", "Hey JaN,\nTim sagte mir du hast die ganze Harry Potter Reihe an Büchern. Ich habe gerade voll Langeweile und würde mir gerne mal etwas Leselektüre ausleihen. Ich bring dir als Danke mal ein 6er Bier vorbei :) Grüße\nAnna");
		emails[6] = new Email("Spieleabend", "Hey Leudde,\nheute Abend bei uns Spieleabend mit leckeren Cocktails. Biste dabei?\nGrüße Laura und Dennis");
		emails[7] = new Email("Festival", "Hey,\ndas letzte Mal Flanky Ball ist schon ein Weilchen her. Ich würde sagen Zeit fürs nächste Festival ;) Biste diesen Sommer wieder am Start? Wollen entweder aufs Highfield, Hurricane oder Wacken. Over and out Digga\nKolle");
		emails[8] = new Email("Game Jam", "Moinsen,\nhab gehört der FSR organisiert einen Game Jam. Weißt du wann der ist? Hätte da ja mal echt Bock drauf, wie schauts bei dir aus?\n\nViele Grüße\nBasti");
		emails[9] = new Email("Fußball", "Hey Dave,\nkommste in zwei Wochen mit zum Pauli-Spiel? Die Bielefelder hauen wir wech. Keine Ahnung, wo die Spieler her kommen, Bielefeld gibts doch eh nicht :D\nGrüße\nMaik");
		emails[10] = new Email("Kleidertausch", "Hey Bine,\nhabe heute gehört, dass demnächst ein Kleidertausch ist. Kommste mit?\nBussi\nFrauke");
		emails[11] = new Email("AW Fußball", "Ey Jaaaan,\nsischer bin ich dabei! Ich frag die restlichen Jungs auch mal. Bis Donnerstag, Dave");
		emails[12] = new Email("Hausaufgaben", "Hallo,\nhat jemand von euch die Hausaufgaben programmiert und verstanden? Ich bräuchte da mal Hilfe. Ciao Dome");
		emails[13] = new Email("Kino", "Hey Mädels,\nam Samsta kommt der Goldene Handschuh in die Kinos. Da gabs ja auch ein Buch zu, das war schon echt krass. Lass uns da mal hingehen.\nGrüße\nLaura");
		emails[14] = new Email("Zocken", "Hey ho, Lust auf ne Runde Spielen am Wochenende und Grillen im Stadtpark? Sag mal Bescheid, ob du dabei bist! LG");
		emails[15] = new Email("Badminton", "Hey jan,\nwir waren am Sonntag Badminton spielen, das war ja so mega. Nächstes Mal musst du mitkommen. Wie geht es eigentlich deiner Kleinen?\nViele Grüße\nRudi");
		emails[16] = new Email("Treffen", "Aloha,\nkommste nachher mit zum Slam? Wollen uns um 19 uhr treffen und dann was Essen gehen. Es geht dann um 20:30 Uhr los.\nCu Peter");
		emails[17] = new Email("Bier brauen", "Hey jaN,\nSarae will mal Bier brauen, du musst dann wohl unter übel vorbei kommen zum kosten.\nBis denne\nSteve");
		emails[18] = new Email("Friday4Future", "Hey Laura,\nwollen 00:34:45wir mal Werbung für Friday4Future machen? Können ja mal nachher drüber quatschen. Wann treffen wir uns eigentlich?");
		emails[19] = new Email("Bla", "Test, bla, test, huhu, was geht, was geht Sößnne?");

		//wir suchen hier nach dem Namen Jan. Dabei sind Varianten wie z.B. JAn, jaN, JaaaaN, JAAAAAN, jan, Jan, JAN, ... erlaubt 
//		SearchContent search1 = new SearchContent("[Jj][Aa]+[Nn]", emails);
//		for(Email e : search1.getResults()) {
//			System.out.println(e);
//		}
		
		//whitespace = leerzeichen, tab(\t), zeilenumbruch(\n), carriage return (\r)
		//wir suchen nach einem Wort das mit s oder S anfängt und mit e aufhört. 
		//Zwischen dem S/s und dem e können Buchstaben von a-z bwz von A-Z beliebig oft auftauchen
		//Wir legen fest, dass vor dem Wort ein Whitespace sein muss und nach dem Wort keine Zahl und kein Buchstabe direkt angehängt ist.
//		SearchContent search2 = new SearchContent("\\s[sS][a-zA-Z]*e\\W?", emails);

		//wir suchen nach einem Wort das mit s oder S anfängt und mit e aufhört. 
		//Zwischen dem S/s und dem e können Buchstaben von a-z bwz von A-Z, ü, ä, ö, Ü, Ä, Ö, ß beliebig oft auftauchen
		//Das Wort kann mit einem Satzzeichen(.,?!) enden oder mit einem Whitespace
//		SearchContent search2 = new SearchContent("\\s[sS][a-zA-ZüöäÜÖÄß]*e((\\s)|([.,?!]))", emails);

		//wir suchen nach einem Wort das mit a-k oder A-K anfängt am Ende eines Satzes steht(auf das Wort folgt direkt .?!).
		//Falls das Wort mehr als einen Buchstaben hat, kann der zweite bis letzte Buchstabe a-z bzw A-Z sein.
		//Nach dem Punkt kann ein Whitespace oder ein Zeilenende folgen (z.B. Ende des Strings).
//		SearchContent search2 = new SearchContent("\\s[a-kA-K][a-zA-Z]*[.?!]((\\s)|($))", emails);
		
		//Wir suchen nach einer Uhrzeit, die wie folgt aufgebaut ist: 10:34:51 oder 00:01:59
													//stunden			:minuten	: sek
		SearchContent search2 = new SearchContent("((2[0-3])|([01][0-9])):[0-5][0-9]:[0-5][0-9]", emails);
		
		//Gib die Ergebnisse für die Suche search2 aus.
		for(Email e : search2.getResults()) {
			System.out.println(e);
		}		
		
	}
	
	
}
