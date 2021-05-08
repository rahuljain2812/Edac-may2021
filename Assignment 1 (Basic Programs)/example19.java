import java.util.Scanner;
class Example19
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
int binary[]=new int[20];
int index=0;
System.out.print("Input a decimal number:");
int n=sc.nextInt();
	while(n>0)
	{
		binary[index++]= n%2;
		n= n/2;
	}
	System.out.print("Binary= ");
	for (int i=index-1; i>=0; i--)
	{
		System.out.print(binary[i]);
	}
}}
	
