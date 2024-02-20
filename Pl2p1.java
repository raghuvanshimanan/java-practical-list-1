import java.util.*;
public class Pl2p1
{
	public static void main(String[] args)
	{
		Person obj = new Person("Manan",20);
	}

}
class Person
{
	Person(String name, int age)
	{
		String n = name;
		int a = age;
		System.out.println("Name is ::"+n);
		System.out.println("Age is ::"+a);
	}
}