package main;
public class Vehicle{
	private int currentSpeed;
	private int direction;
	private String ownerName;
	private static int highestVehicleIdentificationNumberIssued = 1000;
	private int vehicleId ;
	public static final int TURN_LEFT = 0;
	public static final int TURN_RIGHT = 1;
	private int turnOption;
	
	public Vehicle(){
	this.vehicleId = ++highestVehicleIdentificationNumberIssued;

	}
	public Vehicle(String ownerName,int currentSpeed,int direction,int vehicleId){
		this.ownerName = ownerName;
		this.currentSpeed = currentSpeed;
		this.direction = direction;
		this.vehicleId = vehicleId;
	}
	
	public int getCurrentSpeed(){
		return currentSpeed;
	}
	public int getDirection(){
		return direction;
	}
	public String getOwnerName(){
		return ownerName;
	}
	public int getVehicleId(){
		return vehicleId;
	}
	public int getTurnOption(){
		return turnOption;
	}
	public int changeSpeed(int speed){
		return this.currentSpeed + speed;
		
	}
	public int stop(){
		this.currentSpeed = 0;		
		return this.currentSpeed;
	}
	public int changeDirection(int direction ,int turnOption){
		this.turnOption = turnOption;
		this.direction = direction;
		return this.direction;
	}
	public static int getHighestVehicleIdentificationNumberIssued(){
		return highestVehicleIdentificationNumberIssued;
	}
	public String toString(){
		return currentSpeed+" "+direction;
	}

}