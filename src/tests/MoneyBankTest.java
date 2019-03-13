package tests;
import main.MoneyBank;
import static org.junit.Assert.*;
import org.junit.Test;



public class MoneyBankTest{
	


	@Test
	public void testNextAccountNumber(){
		MoneyBank a1 = new MoneyBank("john",20000);
		assertEquals(1,a1.getNextAccountNumber());	
	}

	@Test
	public void testWithdrawWithValidInputs(){
		MoneyBank a1 = new MoneyBank("john",20000);
		assertEquals(10000,a1.withdraw(10000),0.2);	
	}






}