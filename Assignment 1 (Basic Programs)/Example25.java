import java.util.Scanner;
class Example25
{
    public static void main (String args[])
    {
	Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Octal number; ");
		int n = sc.nextInt();
        int dec = 0;
        int base = 1;
        int temp = n;
        while (temp > 0) 
		{
            int rem = temp % 10;
            temp = temp / 10;
            dec += rem * base;
            base = base * 8;
        }
		System.out.println("Decimal number is: "+dec);
	}
}