import java.util.Scanner;
class VowelConsonantUsingSwitch
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character:");
		char ch=sc.next().charAt(0);

		if(ch>='A' && ch<='Z' || ch>='a' && ch<='z')
		{
			System.out.println(ch);
		
			switch(ch)
			{
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
				case 'A':
				case 'E':
				case 'I':
				case 'O':
				case 'U':
				{
					System.out.println("It is a Vowel");
					break;
				}
				default:
				{
					System.out.println("It is a Consonant");
					break;
				}
				
			}
		}
		else
		{
			System.out.println("Invalid Input");
		}
	}
}