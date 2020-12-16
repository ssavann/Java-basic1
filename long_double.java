public class long_double
{

	public static void main(String[] args)
	{

		long myLongValue = 100L;
		
		//Long minimum value: -9223372036854775808
        long myLongMinValue = Long.MIN_VALUE;

        //Long maximum value: 9223372036854775807
        long myLongMaxValue = Long.MAX_VALUE;

        

        System.out.println("Long Minimum Value = " + myLongMinValue);
        System.out.println("Long Maximum Value = " + myLongMaxValue);

        //Long minimum value: 4.9E-324
        double myDoubleMinValue = Double.MIN_VALUE;

        //Long maximum value: 1.7976931348623157E308
        double myDoubleMaxValue = Double.MAX_VALUE;

        

        System.out.println("Double Minimum Value = " + myDoubleMinValue);
        System.out.println("Double Maximum Value = " + myDoubleMaxValue);


	}
}