package exceptions;

public class BuildingManager {
	
	public static void main(String[] args) {
		
		Building building = new Building();
		building.setFlying(false);
		
		try {
			building.rotate();
		} catch (NotEnoughDistanceToGroundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception ex) {
			
		}
		
		building.setCoffeeMaschineWorking(false);
		building.setWaterAvailable(false);
		
		try {
			building.cookCoffee();
		} catch (NoWaterException | CoffeeMaschineIsDeadException e) {
			e.printStackTrace();
//		} catch (CoffeeMaschineIsDeadException e) {
//			e.printStackTrace();
		}
		
	}

}
