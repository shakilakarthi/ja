import java.util.Scanner;


public class Fact {

	public static void main(String[] args) {
       int n,c,fact=1;
       System.out.println("Enter the value :");
       Scanner in=new Scanner(System.in);
       n=in.nextInt();
       for(c=1;c<=n;c++)
       {
    	   fact*=c;
       }
System.out.println(fact);
	}

}
