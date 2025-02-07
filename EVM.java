import java.util.Scanner;
class EVM
{
 public static void main(String[] args)
 {
   Scanner Sc= new Scanner(System.in);
   int bjp=0,cng=0,ss=0,aap=0,mns=0,nota=0;
   
   System.out.println("Enter the population=");
   int population= Sc.nextInt();
   
   for(int i =1; i<=population;i++)
   {
	System.out.println();
    System.out.println("      List of Parties   ");
    System.out.println("1.bjp");
    System.out.println("2.Congress ");
    System.out.println("3.Shiv Sena");
    System.out.println("4.Aam Aadami");
    System.out.println("5.Manase ");
    System.out.println("6.NOTA ");
    System.out.println();
    System.out.println("Enter Your option=");
    int opt= Sc.nextInt();
    
    if(opt>=1 && opt<=6)
    {
    
    if(opt==1)
    {
     bjp++;
     System.out.println("Acche din aayenge");
    }
    if(opt==2)
    {
     cng++;
     System.out.println("Bharat JODO");
    }
    if(opt==3)
    {
     ss++;
     System.out.println("Hum hail asali sena");
    }
    if(opt==4)
    {
     aap++;
     System.out.println("Muze aazad karo");
    }
    if(opt==5)
    {
     mns++;
     System.out.println("Jai Maharashtra");
    }
    if(opt==6)
    {
     nota++;
     System.out.println("You are educated person");
    }
     if(!(opt>=1 && opt<=6))
    {
     i--;
     System.out.println("Invalid Option");
    }
    }
    
    if(bjp >= cng && bjp >=ss && bjp >= aap && bjp>=mns && bjp >=nota)
	   {
		System.out.println("BJP won the election");
	   }
	   
	   if(cng >= bjp && cng >=ss && cng >= aap && cng>=mns && cng >=nota)
	   {
		System.out.println("Congress won the election");
	   }
    
	if(ss >= cng && ss >=bjp && ss >= aap && ss>=mns && ss >=nota)
	   {
		System.out.println("Shiv Sena won the election");
	   }
	
	if(aap >= cng && aap >=ss && aap >= bjp && aap>=mns && aap >=nota)
	   {
		System.out.println("Aam Aadami won the election");
		
	   }
	   if(mns >= cng && mns >=ss && mns>= aap && mns>=bjp && mns >=nota)
	   {
		System.out.println("Manase won the election");
	   }
	   if(nota >= cng && nota >=ss && nota >= aap && nota>=mns && nota >=bjp)
	   {
		System.out.println("NOTA won the election");
	   }
   }
 }
}