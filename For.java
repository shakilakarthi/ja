import java.util.Scanner;


public class For 
{
public static void main(String[] args) {
	int n,sum=0;
	System.out.println("Enter thr value :");
	Scanner in=new Scanner(System.in);
	n=in.nextInt();
	for(int i=0;i<n;i++)
	{
		sum=sum+i;
		System.out.println(sum);
	}
}
}
