import java.util.*;

class DateAssignment{
	public static void main(String []arg){
		int []array;
		boolean compare = false;
		Date d1 = new Date(4,4,2019);
		Date d2 = new Date(4,6,2019);
		System.out.println("first date is"+d1.toString());
		System.out.println("second date is"+d2.toString());
		compare = d1.isSmaller(d2);
		
		if(compare == true)
		{
			System.out.println("first date is smaller");
		}
		else
			System.out.println("second date is smaller");

		array = d1.diff(d2);	
		System.out.println("difference between date is  "+array[0]);
		System.out.println("difference between months is  "+array[1]);
		System.out.println("difference between years is  "+array[2]);	
		
	}

}