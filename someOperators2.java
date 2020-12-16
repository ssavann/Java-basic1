public class someOperators2 
{

	public static void main(String[] args)
	{
        double myFirstValue = 35.00d;
        double mySecondValue = 80.00d;
        double myValuesTotal = (myFirstValue + mySecondValue) * 100.00d;
        System.out.println("My Values Total = " + myValuesTotal);


        double theRemainder = myValuesTotal % 40.00d;
        System.out.println("The remainder = " + theRemainder);

        boolean isNoRemainder = (theRemainder == 0) ? true : false;
        System.out.println("is No remainder = " + isNoRemainder);

        if(!isNoRemainder)
        {
            System.out.println("Got some remainder");
        }
		
	}
}