import java.util.Scanner;
class example6
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Input 1st number");
int n1=sc.nextInt();
System.out.println("Input 2nd number");
int n2=sc.nextInt();
System.out.println(n1+ "+" +n2 +"="+ (n1+n2));
System.out.println(n1+ "-" +n2 +"="+ (n1-n2));
System.out.println(n1+ "*" +n2 +"="+ (n1*n2));
System.out.println(n1+ "/" +n2 +"="+ (n1/n2));
System.out.println(n1+ "%" +n2 +"="+ (n1%n2));
}
}
