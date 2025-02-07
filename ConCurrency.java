import java.util.Scanner;
class ConCurrency
{
	public static void main(String[] args)
	{
		Scanner ab=new Scanner(System.in);
		System.out.println();
		System.out.println(" Currency Converter:");
		System.out.println();
		System.out.print("Enter the amount(INR):");
		float inr=ab.nextFloat();
		System.out.println();

		System.out.println("List Of Currency:");
		System.out.println("1 : USD");
		System.out.println("2 : EUR");
		System.out.println("3 : GBP");
		System.out.println("4 : PKR");
		System.out.println("5 : JPY");
		System.out.println("6 : AUD");

		System.out.println("Enter Currency:");
		String op=ab.next().toUpperCase();
		float ans=0;

		if(op.equals("USD"))
		{
			ans=inr/86.56f;
			System.out.println(ans);
		}
		else if(op.equals("EUR"))
		{
			ans=inr/90.25f;
		}
		else if(op.equals("GBP"))
		{
			ans=inr/107.713f;
			System.out.println(ans);
		}
		else if(op.equals("PKR"))
		{
			ans=inr/3.2192f;
			System.out.println(ans);
		}
		else if(op.equals("JPY"))
		{
			ans=inr*0.01841f;
			System.out.println(ans);
		}
		else if(op.equals("AUD"))
		{
			ans=inr*0.01841f;
			System.out.println(ans);
		}
		else
		{
			System.out.println("Invalid Input");
			
		}
	}
}

	





