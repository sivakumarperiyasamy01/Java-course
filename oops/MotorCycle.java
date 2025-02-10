package oops;

public class MotorCycle {
	
	private int speed;
	
	
	MotorCycle(){
		this(10);
		
	}
	

	MotorCycle(int value){
		this.speed=value;
		
	}
	
	

	void start() {
		System.out.println("vehicle started");
	}
	
	
	void updateSpeed(int speedvalue) {
		if(speedvalue>0)
		 this.speed=speedvalue;
		
		
	}
	
	int getspeed() {
		return this.speed;
	}
	
	void increasespeed(int speedvalue) {
		updateSpeed(speedvalue+200);
		
	}
	
	void decreasespeed (int sppedval) {
		this.speed=sppedval-100;
		
	}
	
	

}
