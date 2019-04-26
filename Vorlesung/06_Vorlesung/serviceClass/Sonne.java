package serviceClass;
import java.io.Serializable;

public class Sonne implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String text;
	private double temp;
	private Helium helium;
	
	public Sonne(String text, double temp, Helium helium) {
		this.text = text;
		this.temp = temp;
		this.helium = helium;
	}

	@Override
	public String toString() {
		return "Sonne [text=" + text + ", temp=" + temp + ", helium=" + helium + "]";
	}

	
	
	
}
