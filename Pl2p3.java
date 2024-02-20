public class Pl2p3
{
	public static void main(String[] args)
	{
		Math m1 =new Math();
		Math m2 =new Math(5,6);	
	}
}
class Math{
	Math()
	{
		System.out.println("Welcome to java program");
	}
	Math(int x,int y)
	{
		int a = x;
		int b = y;
		System.out.println(a+b);
	}
}