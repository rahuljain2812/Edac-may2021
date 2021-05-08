import java.util.Scanner;
class Example23
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Binary number: ");
		int Binary=sc.nextInt();
		int[]hex = new int[1000];
		int dec=0;
		int i=1,rem;
		while(Binary>0)
		{
			rem= Binary%2;
			dec = dec + rem * i;
			i= i*2;
			Binary/=10;
		}
		System.out.println("Decimal Number is : "+dec);
		i=0;
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
					System.out.println(hex[j]);
				}
			}
	}
}
	