package code;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Vector;

public class TestSeletion implements CritereSelection{
	
	@Override
	public boolean ok(Object o)
	{
		int x = (int)o;
		if(x%3==0)
			return true;
		else
			return false;
	}
	
	public static Collection selection(Collection source, CritereSelection critere)
	{
		Vector c = new Vector();
		for(Object o : source)
		{
			if(critere.ok(o))
				c.add(o);
		}
		return c;
	}
	
	public static void main(String args[])
	{
		Vector<Integer> l = new Vector<Integer>();
		for(int i=0;i<=100;i++)
		{
			l.add(i);
		}
		
		CritereSelection c = new TestSeletion() ;
		Vector<Integer> lm3 = new Vector<Integer>();
		
		lm3 = (Vector)selection(l,c);
		System.out.println(lm3);
	}

	
}
