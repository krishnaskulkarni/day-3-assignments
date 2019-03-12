package tests;
import org.junit.Test;
import static org.junit.Assert.*;
import main.Triangle;

public class TriangleTest{
	@Test
	public void testTriangleWhichisRightAngled(){
		Triangle abc = new Triangle(3,4,5);
		assertTrue(abc.isRightAngled());
	}	
	
	@Test
	public void testTriangleWhichisNotRightAngled(){
		Triangle abc = new Triangle(3,4,7);
		assertFalse(abc.isRightAngled());
	}
	
	@Test
	public void testTriangleWhichisScalene(){
		Triangle abc = new Triangle(3,5,7);
		assertTrue(abc.isScalene());
	}
	
	@Test
	public void testTriangleWhichisNotScalene(){
		Triangle abc = new Triangle(3,3,7);
		assertFalse(abc.isScalene());
	}
	@Test
	public void testTriangleWhichisIsosceles(){
		Triangle abc = new Triangle(3,3,7);
		assertTrue(abc.isIsosceles());
	}
	@Test
	public void testTriangleWhichisNotIsosceles(){
		Triangle abc = new Triangle(3,5,7);
		assertFalse(abc.isIsosceles());
	}
	@Test
	public void testTriangleWhichisEquilateral(){
		Triangle abc = new Triangle(3,3,3);
		assertTrue(abc.isEquilateral());
	}
	@Test
	public void testTriangleWhichisNotEquilateral(){
		Triangle abc = new Triangle(3,3,4);
		assertFalse(abc.isEquilateral());
	}
} 