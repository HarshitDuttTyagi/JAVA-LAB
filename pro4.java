package programs;
import java.util.*;
public class pro1 {
	public static void main(String[] args) {
		System.out.println("enter your choice 1-for term deposit and 2-for recurring deposit");
		Scanner sc=new Scanner(System.in);
		int amt,p,r,t,n;
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("enter the principle,rate,time in years");
			p=sc.nextInt();
			r=sc.nextInt();
			t=sc.nextInt();
			amt=(p*r*t)/100;
			System.out.println("Maturiy amt is:"+amt);
			break;
		case 2:
			System.out.println("enter the monthly installment,rate,time in months");
			p=sc.nextInt();
			r=sc.nextInt();
			n=sc.nextInt();
			amt=p*n+p*n*(n+1)/2*r/100*1/12;		
			System.out.println("Maturiy amt is:"+amt);
			break;
		}
		
	}

}
