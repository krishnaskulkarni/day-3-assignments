package tests;
import org.junit.Test;
import main.Vehicle; 
import static org.junit.Assert.*;
import org.junit.Before;

public class VehicleTest{
	Vehicle v1;
	Vehicle v2;
	Vehicle v3;
	Vehicle v4;
	@Before
	public void setUp(){
		v1=new Vehicle("john",80,45,0);
		v2=new Vehicle("spider",60,180,0);
		v3=new Vehicle("tony",55,90,0);
		v4=new Vehicle("peter",46,60,0);
	}
	@Test
	public void testChangeSpeedWithValidInputs(){
		assertEquals(100,v1.changeSpeed(20));
	}
	@Test
	public void testChangeSpeedWithNegativeInputs(){
		assertEquals(60,v1.changeSpeed(-20));
	}
	@Test
	public void testChangeSpeedWithZeroInput(){
		assertEquals(80,v1.changeSpeed(0));
	}
	@Test
	public void testStop(){
		assertEquals(0,v1.stop());
	}
	@Test
	public void testChangeDirectionWithValidInput(){
		assertEquals(45,v1.changeDirection(45,0));
		assertEquals(Vehicle.TURN_LEFT,v1.getTurnOption());
	}
	@Test
	public void testChangeDirectionWithChangedInput(){
		assertEquals(45,v1.changeDirection(45,1));
		assertEquals(Vehicle.TURN_RIGHT,v1.getTurnOption());
	}
	@Test
	public void testToString(){
		assertEquals("80 45",v1.toString());
	}
}