import java.util.*;
class Example18
{
public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first binary number: ");
		String a = sc.next();
		System.out.print("Enter second binary number: ");
		String b = sc.next();
		int num1= Integer.parseInt(a, 2);
		int num2= Integer.parseInt(b, 2);
		int product=num1*num2;
		System.out.println("Product of two Binary Number="+Integer.toBinaryString(product));
    }
}