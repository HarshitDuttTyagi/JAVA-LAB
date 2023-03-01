package programs;
import java.util.*;
public class pro1 {

	public static void main(String[] args){
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		String str=Integer.toString(n);
		String str1="";
		for(int i=0;i!=str.length();i++)
		{
			if(str.charAt(i)=='0')
				str1=str1+'1';
			else
				str1=str1+str.charAt(i);
		}
		System.out.println("output:"+str1);
	}

}
