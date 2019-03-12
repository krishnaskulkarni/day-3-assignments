package main;
public class Vehicle{
	private int currentSpeed;
	private int direction;
	private String ownerName;
	private static int highestVehicleIdentificationNumberIssued = 4567;
	private int vehicleId;

	public Vehicle(){


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
	public int changeSpeed(int speed){
		return this.currentSpeed + speed;
		
	}
	public void stop(){
		this.currentSpeed = 0;
	}
	public void turnDegrees(int direction){
		this.direction = direction;
	}
	public void turnLeftRight(){
		
	}
	public static int getHighestVehicleIdentificationNumberIssued(){
		return highestVehicleIdentificationNumberIssued;
	}

}