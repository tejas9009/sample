class Swap
{
	public static void main(String args[])
	{
		int x = 5;
		int y = 10;
		
		System.out.println("Before Swapping: "+x+" "+y);
		int temp = x;
		x=y;
		y=temp;
		System.out.println("After Swapping: "+x+" "+y);
	}
}