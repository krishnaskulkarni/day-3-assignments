package tests;
import main.Country;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;


public class CountryTest{
	Country arr[];

	@Before
	public void setUp()
	{
	arr=new Country[3];
	arr[0]=new Country("Ind",10000,23456);
	arr[1]=new Country("Aus",10010,234526);
	arr[2]=new Country("SA",10100,23458);
	}
	
	@Test
	public void areaTestWithValidInputs(){
		Country expectedCountry = new Country("Aus",10010,234526);
		Country actualCountry = new Country().largestArea(arr);
		assertEquals(expectedCountry.getCountryName(),actualCountry.getCountryName());
	}

	@Test
	public void populationTest(){
		Country expectedCountry = new Country("SA",10100,23458);
		Country actualCountry = new Country().largestPopulation(arr);
		assertEquals(expectedCountry.getPopulation(),actualCountry.getPopulation());
	}
	
	@Test
	public void populationDensityTest(){
		Country expectedCountry = new Country("Ind",10000,23456);
		Country actualCountry = new Country().largestPopulationDensity(arr);
		assertEquals(expectedCountry.getPopulation(),actualCountry.getPopulation());
	}
	
}