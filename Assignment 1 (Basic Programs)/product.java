import java.util.Scanner;
class product
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
System.out.println("Input first number:");
int n1=sc.nextInt();
System.out.println("Input second number:");
int n2=sc.nextInt();
int product= n1*n2;
System.out.println(n1+ "*" +n2+ "=" +product);
}
}