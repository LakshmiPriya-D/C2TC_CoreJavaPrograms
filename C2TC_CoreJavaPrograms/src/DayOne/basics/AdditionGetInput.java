package DayOne.basics;
import java.util.Scanner;

public class AdditionGetInput {
	public static void main(String[] args) {
		int a,b,c;
		Scanner s= new Scanner(System.in);
		System.out.println("Enetr the values");
		a=s.nextInt();
		b=s.nextInt();
		c=a+b;
		System.out.println("Addition of "+a+" and "+b+" is "+c);
	}

}
