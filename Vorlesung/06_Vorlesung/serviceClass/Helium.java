package serviceClass;
import java.io.Serializable;

public class Helium implements Serializable{

	private String text;
	private int bla;
	
	
	
	public Helium(String text, int bla) {
		super();
		this.text = text;
		this.bla = bla;
	}
	
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public int getBla() {
		return bla;
	}
	public void setBla(int bla) {
		this.bla = bla;
	}
	
	
	
	
}
