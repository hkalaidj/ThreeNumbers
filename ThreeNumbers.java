package threenumbrs;
import java.util.Scanner;

public class threenumbrs {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("input first number : ");
		 double num1=input.nextDouble();
		System.out.print("input second number : ");
		double num2=input.nextDouble();
		System.out.print("input third number : ");
	    double  num3=input.nextDouble();
	    {System.out.println( "The numbers in ascending value are");}
	    displaySortedNumbers(num1, num2, num3);
	}
public static void displaySortedNumbers(double num1, double num2, double num3) {
	
	
if (num1<=num2 && num2<=num3 && num3>=num1)

{System.out.println(num1+" "+num2+" "+num3);}
else if (num1<=num2 && num2>=num3 && num3 >=num1)

{System.out.println(num1+" "+num3+" "+num2);}

else if (num1>=num2 && num2<=num3 && num3>=num1)

{System.out.println(num2+" "+num1+" "+num3);}

else if (num1<=num2 && num2>=num3 && num2>=num3)

{System.out.println(num3+" "+num1+" "+num2);}

else if (num1>=num2 && num2>=num3 && num3<=num1)

{System.out.println(num3+" "+num2+" "+num1);}

else if (num1>=num2 && num2<=num3 && num3<=num1)

{System.out.println(num2+" "+num3+" "+num1);}

}
}
