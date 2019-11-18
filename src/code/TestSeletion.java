package code;

import java.util.Collection;

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
		Collection c = null;
		for(Object o : source)
		{
			if(critere.ok(o))
				c.add(o);
		}
		return c;
	}
	
	public static void main(String args[])
	{
		
	}

	
}
