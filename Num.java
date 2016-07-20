import java.util.Scanner;


public class Num
{

	public static void main(String[] args) 
	{
   int n;
   System.out.println("Enter the num :");
   Scanner in= new Scanner(System.in);
   n=in.nextInt();
   if(n%2==0)
   {
	   System.out.println("Even");
   }
	   else
	   {
		   System.out.println("Odd");
	   }
   }
	}

