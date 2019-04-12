package exceptions;

public class Building {
	
	private String name;
	private String purpose;
	private String place;
	private String material;
	private boolean isFlying;
	private double size;
	private boolean isWaterAvailable;
	private boolean isCoffeeMaschineWorking;
	
	
	public void rotate() throws NotEnoughDistanceToGroundException { //boden zu nah exception
		if(!isFlying) {
			throw new NotEnoughDistanceToGroundException("The building is not flying, so it cannot rotate");
		}
	}
	
	public void fly() {
		
	}
	
	public void cookCoffee() throws NoWaterException, CoffeeMaschineIsDeadException { //wasser oder kaffeepulver fehlt exception
		if(!isCoffeeMaschineWorking) {
			throw new CoffeeMaschineIsDeadException("You should build a new building");
		}
		if(!isWaterAvailable) {
			throw new NoWaterException("Send a minion to buy water");
		}
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

	public boolean isWaterAvailable() {
		return isWaterAvailable;
	}

	public void setWaterAvailable(boolean isWaterAvailable) {
		this.isWaterAvailable = isWaterAvailable;
	}

	public boolean isCoffeeMaschineWorking() {
		return isCoffeeMaschineWorking;
	}

	public void setCoffeeMaschineWorking(boolean isCoffeeMaschineWorking) {
		this.isCoffeeMaschineWorking = isCoffeeMaschineWorking;
	}
	
	

}
