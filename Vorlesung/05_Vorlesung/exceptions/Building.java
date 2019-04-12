package exceptions;

public class Building {
	
	private String name;
	private String purpose;
	private String place;
	private String material;
	private boolean isFlying;
	private double size;
	
	
	public void rotate() { //boden zu nah exception
		
	}
	
	public void fly() {
		
	}
	
	public void cookCoffee() { //wasser oder kaffeepulver fehlt exception
		
	}
	
	public void talk() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public boolean isFlying() {
		return isFlying;
	}

	public void setFlying(boolean isFlying) {
		this.isFlying = isFlying;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}
	
	

}
