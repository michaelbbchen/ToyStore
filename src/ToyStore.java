//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStore
{
	private ArrayList<Toy> toyList = new ArrayList<>();

	public ToyStore()
	{
	}

	public void loadToys( String toys )
	{
            String[] arr = toys.trim().split(" ");
            for(String n: arr){
                boolean found = false;
                if(toyList.size() > 0){
                    for(Toy t: toyList){
                        if(t.getName().equals(n)){
                            t.setCount(t.getCount() + 1);
                            found = true;
                            break;
                        }
                    }
                }
                if(!found){
                    toyList.add(new Toy(n));
                }
            }
	}
  
  	public Toy getThatToy( String nm )
  	{
  		for(Toy t: toyList){
                    if(t.getName().equals(nm)){
                        return t;
                    }
                }
                return null;
  	}
  
  	public String getMostFrequentToy()
  	{
  		int curm = 0;
                Toy ret = new Toy();
                for(Toy t: toyList){
                    if(t.getCount() > curm){
                        ret = t; curm = t.getCount();
                    }
                }
                return ret.getName();
  	}  
  
  	public void sortToysByCount()
  	{
  	}  
  	  
	public String toString()
	{
	   return "" + toyList;
	}
}