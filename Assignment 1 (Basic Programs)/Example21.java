import java.util.Scanner;
class Example21
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
int Octal[]=new int[20];
int index=0;
System.out.print("Input a decimal number:");
int n=sc.nextInt();
	while(n>0)
	{
		Octal[index++]= n%8;
		n= n/8;
	}
	System.out.print("Octal= ");
	for (int i=index-1; i>=0; i--)
	{
		System.out.print(Octal[i]);
	}
}}