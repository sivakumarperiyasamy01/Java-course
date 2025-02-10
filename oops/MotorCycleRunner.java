package oops;

public class MotorCycleRunner {

	public static void main(String[] args) {
		
		MotorCycle royalEnfield=new MotorCycle(1000);
		MotorCycle Ducati=new MotorCycle(5000);
		MotorCycle yamaka=new MotorCycle(444);
		
		
		
		System.out.println(yamaka.getspeed());
		System.out.println(Ducati.getspeed());
		System.out.println(royalEnfield.getspeed());
		royalEnfield.start();
		Ducati.start();
		
		royalEnfield.updateSpeed(100);
		
		System.out.println(royalEnfield.getspeed());
		
		royalEnfield.increasespeed(100);
		
		System.out.println(royalEnfield.getspeed());
		
		royalEnfield.decreasespeed(100);
		System.out.println(royalEnfield.getspeed());
	}

}
