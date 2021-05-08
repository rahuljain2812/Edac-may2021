import java.util.Scanner;
class table
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
System.out.println("Input a number: ");
int n=sc.nextInt();
int n1;
for (int i=1; i<=10; i++)
{
n1=n*i;
System.out.println(n+ "*" +i+ "=" +n1);
}
}}