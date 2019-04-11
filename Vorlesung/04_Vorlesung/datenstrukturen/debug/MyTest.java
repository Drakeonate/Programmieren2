package datenstrukturen.debug;

import java.util.HashSet;
import java.util.Objects;

public class MyTest {
	
	String bla;
	
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		
		set.add("abc");
		set.add("Huhu");
		set.add("Sonne");
		set.add("hamburg");
		set.add("coden");
		
		
		for(String s : set) {
			System.out.println(s);
			
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bla == null) ? 0 : bla.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof MyTest)) {
			return false;
		}
		MyTest other = (MyTest) obj;
		if (bla == null) {
			if (other.bla != null) {
				return false;
			}
		} else if (!bla.equals(other.bla)) {
			return false;
		}
		return true;
	}

//	@Override
//	public int hashCode() {
//		return Objects.hash(bla);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj) {
//			return true;
//		}
//		if (obj == null) {
//			return false;
//		}
//		if (!(obj instanceof MyTest)) {
//			return false;
//		}
//		MyTest other = (MyTest) obj;
//		return Objects.equals(bla, other.bla);
//	}

	
	
	
}
