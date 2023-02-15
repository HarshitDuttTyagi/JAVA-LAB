package proj1;
import java.util.*;
public class pro2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your salary");
		int salary=sc.nextInt();
		int tax;
		if(salary<500000)
			{System.out.println("no tax");
			}
		else if (salary>500000&&salary<1000000)
		{
			salary=salary-500000;
			tax=salary/10;
			System.out.println("tax is: "+tax);
		}
		else
		{
			salary=salary-1000000;
			tax=50000+salary/5;
			System.out.println("tax is:"+tax);
		}

	}

}
