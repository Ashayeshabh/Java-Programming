package P1;
import java.util.*;
public class Check
{
	int a,b;
	public void accept()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number");
		a = sc.nextInt();
		System.out.println("Enter Second Number");
		b = sc.nextInt();
	}
public void checkGreatest()
{
	if(a>b)
		System.out.println("a is greater");
	else
		System.out.println("b is greater");
}
public static void main(String[] args) 
{
	Check c= new Check();
	c.accept();
	c.checkGreatest();
}
}
