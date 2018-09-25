package Inheritance;

public class Main {

	public static void main(String[] args) {
		MountainBike mountainBikeObj = new MountainBike();
		mountainBikeObj.setGear(5);
		mountainBikeObj.setType("Mountain");
		
		System.out.println("The " + mountainBikeObj.getType() + " bike is at gear " + mountainBikeObj.getGear());
	}

}
