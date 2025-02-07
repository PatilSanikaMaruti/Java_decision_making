import java.util.Scanner;
class EvenOddUsingMod
{
	public static void main(String[] args)
	{
		Scanner ab=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num=ab.nextInt();
		if(num%2==0)
		{
			System.out.println("Entered Number is Even");
		}
		else
		{
			System.out.println("Entered Number is Odd");
		}
	}
}