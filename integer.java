public class integer
{

	public static void main(String[] args)
	{
		/*
        The eight primitive data types in java are: 
        boolean, byte, char, short, int, long, float and double.
        */


        

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;


        //this is the Maximum number that can be stored in an Integer number: -2147483648
		System.out.println("Integer Minimum Value = " + myMinIntValue);

        //this is the Maximum number that can be stored in an Integer number: 2147483647
        System.out.println("Integer Maximum Value = " + myMaxIntValue);

        //value will go Overflow: cannot go above 2147483647
        System.out.println("Busted MAX value " + (myMaxIntValue + 1));

        //value will go Underflow: cannot go below -2147483648
        System.out.println("Busted MIN value " + (myMinIntValue - 1));

        
		
	

	}
}


