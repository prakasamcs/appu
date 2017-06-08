package appu1;
import java.util.Scanner;
public class program {
public static void main(String args[])
{
	int i;
	Scanner s=new Scanner(System.in);
	i=s.nextInt();
	if(i>0)
	{
		System.out.println("the number is positive");
	}
	else
	{
		System.out.println("the number is negative");
	}
}
}
