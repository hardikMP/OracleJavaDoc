package ClassesAndObjects;

public class ReturnExample {

	public static void main(String[] args) {
		MountainBike mountainBikeObj =  new MountainBike();
		RacerBike racerBikeObj = new RacerBike();
		
		mountainBikeObj.setSpeed(15);
		racerBikeObj.setSpeed(15);
		
		ReturnExample returnExampleObj = new ReturnExample();
		Bike fastestBikeObj = returnExampleObj.getTheFastestBike(mountainBikeObj, racerBikeObj);
		
		if(fastestBikeObj.equals(mountainBikeObj))
			System.out.println("Moutain bike is faster atm");
		else if(fastestBikeObj.equals(racerBikeObj))
			System.out.println("Racer bike is faster atm");
		else
			System.out.println("Both bikes are equally fast atm");
	}
	
	public Bike getTheFastestBike(MountainBike mountainBikeObj, RacerBike racerBikeObj) {
		if(mountainBikeObj.speed > racerBikeObj.speed)
			return mountainBikeObj;
		else if(racerBikeObj.speed > mountainBikeObj.speed) 
			return racerBikeObj;
		else
			return new Bike();
	}
}

class Bike {
	int speed = 10;
}

class MountainBike extends Bike {
	public void setSpeed(int speed) {
		super.speed = speed;
	}
}

class RacerBike extends Bike {
	public void setSpeed(int speed) {
		super.speed = speed;
	}
}
