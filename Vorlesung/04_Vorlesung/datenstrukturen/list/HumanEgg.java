package datenstrukturen.list;

public class HumanEgg {

	private String color;
	private float weight;
	private float height;
	private String pattern;
	
	
	//rechts klick, Source, Constructor using fields
	public HumanEgg(String color, float weight, float height, String pattern) {
		super();
		this.color = color;
		this.weight = weight;
		this.height = height;
		this.pattern = pattern;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public float getWeight() {
		return weight;
	}


	public void setWeight(float weight) {
		this.weight = weight;
	}


	public float getHeight() {
		return height;
	}


	public void setHeight(float height) {
		this.height = height;
	}


	public String getPattern() {
		return pattern;
	}


	public void setPattern(String pattern) {
		this.pattern = pattern;
	}
	
	@Override
	public String toString() {
		
		return "HumanEgg is " + color + " has the weight " + weight + " has the height " + 
				height + " and has the pattern " + pattern;
	}
	
	
	
}
