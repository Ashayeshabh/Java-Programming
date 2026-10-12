package P3;
import java.util.*;
public class WAP 
{
	int a,b,c;
	public void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		a=sc.nextInt();
		System.out.println("Enter second number");
		b=sc.nextInt();
		System.out.println("Enter third number");
		c=sc.nextInt();
	}
public void checkGreatest()
{
	if(a>b && a>c)
		System.out.println("The largest number is: "+a);
	else if(b>a && b>c)
		System.out.println("The largest number is: "+b);
	else
		System.out.println("The largest number is: "+c);
}
public static void main(String[] args)
{
	WAP c=new WAP();
	c.accept();
	c.checkGreatest();
}
}
