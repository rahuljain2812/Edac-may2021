import java.util.Scanner;
class Example20
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Decimal number: ");
		int dec=sc.nextInt();
		int[]hex = new int[1000];
		int i=0;
		while(dec!=0)
			{
				hex[i]= dec%16;
				dec= dec/16;
				i++;
			}
			System.out.print("Hexa-Decimal Number is : ");
			for(int j=i-1; j>=0; j--)
			{
				if(hex[j]>9)
				{
					System.out.println((char)(hex[j]+55)+" ");
				}
				else
				{
					System.out.print(hex[j]);
				}
			}
	}
}