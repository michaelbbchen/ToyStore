//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class ToyRunner
{
	public static void main(String[] args)
	{
            Toy t1 = new Toy("Sorry");
            Toy t2 = new Toy("gi joe");
            t2.setCount(5);
            System.out.println(t1);
            System.out.println(t2);
	}
}