import java.util.*;

public class Pl2p4
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the raidus circle::");
		double r = sc.nextDouble();
		Area obj = new Area_Circle(r);
	}
}
class Area
{
	Area(double r)
	{
		final Pi = 3.14;
		double rad = r,area;
		area = Pi * rad * rad;
		System.out.println("Area of the Circle is ::"+area);
	}
}