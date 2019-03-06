//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStoreRunner
{
	public static void main( String args[] )
	{
            // sorry bat sorry sorry sorry train train teddy teddy ball ball
            Scanner kb = new Scanner(System.in);
            String inp = kb.nextLine();
            ToyStore ts = new ToyStore();
            System.out.println(ts);
            ts.loadToys(inp);
            System.out.println(ts);
            System.out.println(ts.getMostFrequentToy());
	}
}