package collection;

import java.util.HashMap;

public class UseCustomer {
	public static void main(String args[])
	{
		Customer cs1=new Customer("mani",22,"manimee27@gmail.com",1000,67235623001l,"7524jhdv233");
		Customer cs2=new Customer("kannan",21,"mani@27gmail.com",2000,17355788926l,"724jjufh977");
		Customer cs3=new Customer("deva",23,"deva@.com",30000,283534278982l,"jhy2897jj");
		Customer cs4=new Customer("AAthee",25,"aathe@.com",40000,98374653873l,"ihgfr66899j");
		HashMap<Long,Customer>cc=new HashMap<>();
		cc.put(cs1.getAdharnumber(), cs1);
		cc.put(cs2.getAdharnumber(), cs2);
		cc.put(cs3.getAdharnumber(), cs3);
		cc.put(cs4.getAdharnumber(), cs4);
		/*for(Long l:cc.keySet())
		{
			System.out.println(l);
		}*/
		/*int max=0;
		String name="";
		for(Customer c:cc.values())*/
		{
	
		/*{
			if(c.getAge()>max)
			{
				max=c.getAge();
				name=c.getName();
				
			}
		}
			System.out.println(max+","+name);*/
		
			/*if(c.getName().startsWith("m"))
			{
				System.out.println(c);
			}*/
			
			//System.out.println(c);
		//}
		//cc.forEach((a,b)->System.out.println(a+" Details  "+b));
		//for(Customer cm:cc.values())
		/*{
			if(cm.getName().startsWith("m")&&cm.getEmail().startsWith("m"))
			{
				System.out.println(cm);
			}
		}*/
		{
			//if(cm.get)
		}
		
	}

	}
}
