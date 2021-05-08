import java.util.Scanner;
class example13
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Width=");
float width= sc.nextFloat();
System.out.println("Height=");
float height= sc.nextFloat();
float area=width*height;
System.out.println("Area is="+area);
float perimeter= 2*(width+height);
System.out.println("Perimeter is="+perimeter);
}
}