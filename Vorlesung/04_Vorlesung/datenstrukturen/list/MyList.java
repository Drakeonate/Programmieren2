package datenstrukturen.list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
//strg shift o 	= organize import
public class MyList {

	//strg + leertaste
	public static void main(String[] args) {
		HashSet<String> data = new HashSet<>();
//		LinkedList<String> data = new LinkedList<>();
//		ArrayList<String> data = new ArrayList<>(1000000);
		int max = 100000;
		HashMap<Integer, String> h;

		//HashSet add 40-75 bei 100.000
		//HashSet add 230-250 bei 1.000.000
		//LinkedList add 1200 bei 1.000.000
		//LinkedList add 30-40 bei 100.000
		//ArrayList add 30-40 bei 100.000
		//ArrayList add 80-120 bei 1.000.000
		
		//hol dir die aktuelle Zeit
		long startTime = System.currentTimeMillis();

		for(int i = 0; i < max; i++) {
			data.add("Bla " + i);
		}
		
		//hol dir die aktuelle Zeit
		long endTime = System.currentTimeMillis();
		
		System.out.println("Zeit: " + (endTime - startTime));
		
		//for(Datentyp variablenNameVomElement : liste)

		startTime = System.currentTimeMillis();
		for(int i = 0; i < max; i++) {
			data.remove("Bla " + i);
		}
		endTime = System.currentTimeMillis();
		System.out.println("Zeit: " + (endTime - startTime));
		
		
		//size() = Anzahl der Elemente in der ArrayListe
//		for(int i = 0; i < humaneggs.size(); i++) {
//			//get(i) gibt mir das i-te Element aus der ArrayList
//			System.out.println(humaneggs.get(i));
//		}
	}
	
}
