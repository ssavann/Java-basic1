public class primitive_types
{

	public static void main(String[] args)
	{
		


        byte byteValue = 10;
        short shortValue = 20;
        int intValue = 50;

        //casting a long
        long longTotal = 50000L + 10L * (byteValue + shortValue + intValue);

        System.out.println(longTotal);



        //casting a short
        short shortTotal = (short)(1000 + 10 * (byteValue + shortValue + intValue));

        System.out.println(shortTotal);
        
		
	

	}
}


