import java.util.Scanner;
class TimeTable
{
	public static void main(String [] args)
	{
		Scanner ab=new Scanner(System.in);
		System.out.println("---------------WELCOME--------------");
		
		System.out.println("1.Monday");
		System.out.println("2.Tuesday");
		System.out.println("3.Wednesday");
		System.out.println("4.Thursday");
		System.out.println("5.Friday");
		System.out.println("6.Saturday");
		System.out.println("7.Sunday");

		System.out.print("Choose option:");
		int op=ab.nextInt();

		switch(op)
		{
			case 1:
			{
				System.out.println("Practice math");
				break;
			}
			case 2:
			{
				System.out.println("Learn marathi vyakaran");
				break;
			}
			case 3:
			{
				System.out.println("Practice to speak english");
				break;
			}
			case 4:
			{
				System.out.println("Explore history");
				break;
			}
			case 5:
			{
				System.out.println("Learn science practically");
				break;
			}
			case 6:
			{
				System.out.println("Do your art and craft homework");
				break;
			}
			case 7:
			{
				System.out.println("Enjoy Holiday!!");
				break;
			}
			default:
			{
				System.out.println("Go to school");
				break;
			}
		}
	}
}