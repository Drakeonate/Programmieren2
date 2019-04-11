package datenstrukturen.resources;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TimingTest {

	public static void main(String[] args) {
		int repeat = 10;
		int max = 100000;
		
		
		//add entries
		HashSet<String> set = new HashSet<>();
		checkTimeAddEntry(repeat, max, set, "HashSet");
//		checkTimeRemoveEntry(repeat, max, set, "HashSet");
		set.clear();
		set = null;
		
//		ArrayList<String> list = new ArrayList<>();
//		checkTimeAddEntry(repeat, max, list, "ArrayList");
//		checkTimeRemoveEntry(repeat, max, list, "ArrayList");
//		list.clear();
//		list = null;
//		
//		LinkedList<String> llist = new LinkedList<>();
//		checkTimeAddEntry(repeat, max, llist, "LinkedList");
//		checkTimeRemoveEntry(repeat, max, llist, "LinkedList");
//		llist.clear();
//		llist = null;
		
	}
	
	private static long checkTimeAddEntry(int repeat, int numberEntries, Collection<String> c, String dataStructure) {
		long durchschnitt = 0L;
		long startTime = 0L;
		long endTime = 0L;

		
		for(int r = 0; r < repeat; r++) {
			c.clear();

			startTime = System.currentTimeMillis();
			for(int i = 0; i < numberEntries; i++) {
				c.add("Hallo, dies ist der " + i + ". String");
			}
			endTime = System.currentTimeMillis();
			durchschnitt += (endTime - startTime);
		}
		durchschnitt /= repeat;
		System.out.println(dataStructure + " added " + numberEntries + " entries " + durchschnitt + " ms");
		
		return repeat;
	}

//	private static long checkTimeRemoveEntry(int repeat, int numberEntries, List<String> c, String dataStructure) {
	private static long checkTimeRemoveEntry(int repeat, int numberEntries, Collection<String> c, String dataStructure) {
		long durchschnitt = 0L;
		long startTime = 0L;
		long endTime = 0L;

		for(int r = 0; r < repeat; r++) {
			
			c.clear();
			
			for(int i = 0; i < numberEntries; i++) {
				c.add("Hallo, dies ist der " + i + ". String");
			}
			
			startTime = System.currentTimeMillis();
			
			for(int i = 0; i < numberEntries; i++) {
//			for(int i = numberEntries-1; i >= 0; i--) {
//				c.remove("Hallo, dies ist der " + i + ". String");
				c.remove((numberEntries-i)/2);
			}
			endTime = System.currentTimeMillis();
			durchschnitt += (endTime - startTime);
		}
		durchschnitt /= repeat;
		System.out.println(dataStructure + " removed " + numberEntries + " entries " + durchschnitt + " ms");
		
		return repeat;
	}
	
	

}
