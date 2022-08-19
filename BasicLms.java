package collection;

import java.util.HashMap;
import java.util.Iterator;

public class BasicLms {
	public static void main(String args[])
	{
		HashMap<Integer,String>lms=new HashMap<>();
		lms.put(222,"mani");
		lms.put(345, "kannan");
		lms.put(567, "deva");
		lms.remove(222);
		//System.out.println(lms);
		/*for(Integer in:lms.keySet())
		{
			if(in%2==0)
			{
			System.out.println(in+"is even");
			}
			else
			{
				System.out.println(in+"is odd");
			}*/
		//}
		//lms.forEach((a,b)->System.out.println(a+" "+b));
		/*for(String st:lms.values())
			
		{
			System.out.println(st);
			
		}*/
		/*for(String m:lms.values())
		{
			if(m.contains("a")||m.contains("e")||m.contains("i")||m.contains("o")||m.contains("o")||m.contains("u"))
			{
				System.out.println("its contain");
			}
			else
			{
				System.out.println("its not contain");
			}
		}*/
		Iterator<String>itr=lms.values().iterator();
		{
			while(itr.hasNext())
			{
				if(itr.next().equals("mani"))
				{
					itr.remove();
				}
			}
			System.out.println(lms.values());
		}
		
	}

}
