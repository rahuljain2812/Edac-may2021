import java.util.Scanner;
class Example24
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Binary number: ");
		int Binary=sc.nextInt();
		int[]oct = new int[1000];
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
			oct[i]= dec%8;
			dec= dec/8;
			i++;
		
		}
			System.out.print("Octal Number is : ");
			for(int j=i-1; j>=0; j--)
			{
					System.out.print(oct[j]);
			}
			
			
	}
}
	