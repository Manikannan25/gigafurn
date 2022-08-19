package collection;

import java.util.HashMap;
import java.util.Iterator;

public class UseBike {
	public static void main(String args[])
	{
		Bike bk1=new Bike("yamaha",150000,150,"black",true,"1572ght6278");
		Bike bk2=new Bike("pulsur",180000,160,"blue",true,"0987676jhyu8");
		Bike bk3=new Bike("royalenfield",200000,180,"gold",true,"367489kjuy8");
		Bike bk4=new Bike("honda",80000,140,"red",false,"09875ghy98");
		HashMap<String,Bike>bb=new HashMap<>();
		bb.put(bk1.getChaseNumber(), bk1);
		bb.put(bk2.getChaseNumber(), bk2);
		bb.put(bk3.getChaseNumber(), bk3);
		bb.put(bk4.getChaseNumber(),bk4);
		/*Iterator<String>it=bb.keySet().iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}*/
		/*Iterator<Bike>bi=bb.values().iterator();
		while(bi.hasNext())
		{
			System.out.println(bi.next());
		}*/
		for(Bike b:bb.values())
		/*{
			if(b.getIssuperbike()==true)
			{
				System.out.println(b.getPrice());
			}
		}*/
			/*if(b.getPrice()>=200000)
			{
			System.out.println(b.getbrand());
			}*/
			if(b.getbrand().contains("a")||b.getbrand().contains("e")||b.getbrand().contains("i")||b.getbrand().contains("o")||b.getbrand().contains("u"))
			{
				System.out.println(b.getbrand()+" is contains ");
			}
			else
			{
				System.out.println(b.getPrice());
			}
			
		
	}

}
  