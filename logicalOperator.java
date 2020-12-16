public class logicalOperator
{

	public static void main(String[] args)
	{

		int firstTopScore = 90;
        int secondTopScore = 70;
        
        if((firstTopScore > secondTopScore) && (firstTopScore < 100))
        {
            System.out.println("Greater than second top score and less than 100");
        }

        if((firstTopScore > 90) || (secondTopScore <= 90))
        {
            System.out.println("Either or both of the condition are true");
        }
	}
}