import java.util.Scanner;
class ReverseStringWithoutLoop
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=sc.nextLine();

		StringBuffer rev=new StringBuffer(str);
		System.out.println(rev.reverse());
	}
}