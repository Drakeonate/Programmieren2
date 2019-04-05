package datenstrukturen.list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
//strg shift o 	= organize import
public class MyList {

	//strg + leertaste
	public static void main(String[] args) {
//		ArrayList<HumanEgg> humaneggs = new ArrayList<>();
//		LinkedList<HumanEgg> humaneggs = new LinkedList<>();
		HashSet<HumanEgg> humaneggs = new HashSet<>();
		
		
		//hol dir die aktuelle Zeit
		long startTime = System.currentTimeMillis();
		
		humaneggs.add(new HumanEgg("schwarz", 10.0f, 3.0f, "gepunktet"));
		humaneggs.add(new HumanEgg("rot", 5.0f, 7.0f, "karo"));
		humaneggs.add(new HumanEgg("blau", 240.0f, 100.0f, "gestreift"));

		//hol dir die aktuelle Zeit
		long endTime = System.currentTimeMillis();
		
		System.out.println("Zeit: " + (endTime - startTime));
		
		//for(Datentyp variablenNameVomElement : liste)
		for(HumanEgg e : humaneggs) {
			System.out.println(e);
		}
		
		Iterator<HumanEgg> it = humaneggs.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//size() = Anzahl der Elemente in der ArrayListe
//		for(int i = 0; i < humaneggs.size(); i++) {
//			//get(i) gibt mir das i-te Element aus der ArrayList
//			System.out.println(humaneggs.get(i));
//		}
	}
	
}
