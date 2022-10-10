class Fibo
{
	public static void main(String args[])
	{
		int num1=0,num2=1,num3=0;
		int i=0,n=10;
		while(i<=n)
		{
			System.out.println(num1);
			num3=num1+num2;
			num1=num2;
			num2=num3;
			i++;
		}
	}
}