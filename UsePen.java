package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class UsePen {
	public  static void main(String args[])
	{
		Pen p1=new Pen("cello",10,true);
		Pen p2=new Pen("Palpoint",20,false);
		Pen p3=new Pen("camal",5,true);
		Pen p4=new Pen("natrj",20,true);
		Pen p5=new Pen("parker",10,true);
	

		/*HashMap<String,Pen>sp=new HashMap<>();
		sp.put(p1.getBrand(),p1);
		sp.put(p2.getBrand(), p2);
		sp.put(p3.getBrand(), p3);
		sp.put(p4.getBrand(), p4);
		sp.put(p5.getBrand(), p5);*/
		ArrayList<Pen>sp=new ArrayList<>();
		sp.add(p1);
		sp.add( p2);
		sp.add( p3);
		sp.add(p4);
		sp.add(p5);
		Map<String,Pen>mm=sp.stream().collect(Collectors.toMap(i->i.getBrand(),j->j));
		mm.keySet().forEach(a->System.out.println(mm.get(a)));
	/*for(String st:sp.keySet())
		{
			System.out.println(sp.get(st));
		}*/
		/*ArrayList<Pen>spp=new ArrayList<>();
		sp.values().forEach(a->spp.add(a));
		spp.forEach(y->System.out.println(y));*/
		/*Iterator<Pen>it=sp.values().iterator();
		while(it.hasNext())
		{
			if(it.next().isBluepen()==true)
			{
				it.remove();
			}
		}
			System.out.println(sp.values());*/
		/*List<String>si=sp.values().stream().filter(x->x.isBluepen()==false).map(y->y.getBrand()).collect(Collectors.toList());
		for(String s:si)
		{
			System.out.println(s);*/
		}
					
				
					
		}
	

