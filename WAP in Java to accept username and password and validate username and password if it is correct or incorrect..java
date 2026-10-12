package P2;
import java.util.*;
public class Login 
{
	String u_name="Ashay";
	int pswd=123;
	public void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter username");
		u_name=sc.next();
		System.out.println("Eneter password");
		pswd=sc.nextInt();
	}
public void validate()
{
	if(u_name.equals("Ashay") && pswd==123)
		System.out.println("Login Successful");
	else
		System.out.println("Please Try again");
}
public static void main(String[] args)
{
	Login l=new Login();
	l.accept();
	l.validate();
}
}
