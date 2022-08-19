package collection;

public class Bike {
	private String brand;
	private int price;
	private int engineCc;
	private String color;
	private boolean isSuperBike;
	private String chaseNumber;
	public void setBrand(String btrand)
	{
		this.brand=brand;
		
	}
	public String getbrand()
	{
		return brand;
	}
	public void setprice(int price)
	{
		this.price=price;
	}
	public int getPrice()
	
	{
		return price;
	}
	public void setEnginecc(int engineCc)
	{
		this.engineCc=engineCc;
	}
	public int getEnginecc()
	{
		return engineCc;
	}
	public void setColor(String color)
	{
		this.color=color;
	}
	public String getColor()
	{
		return color;
	}
	public void setIssuperbike(boolean isSuperBike)
	{
		this.isSuperBike=isSuperBike;
	}
	public boolean getIssuperbike()
	{
		return isSuperBike;
	}
	public  void setChaseNumber(String chaseNumber)
	{
		this.chaseNumber=chaseNumber;
	}
	public String getChaseNumber()
	{
		return chaseNumber;
	}
	public Bike(String brand,int price,int engineCc,String color,boolean isSuperBike,String chaseNumber)
	{
		this.brand=brand;
		this.price=price;
		this.engineCc=engineCc;
		this.color=color;
		this.isSuperBike=isSuperBike;
		this.chaseNumber=chaseNumber;
	}
	public String toString()
	{
		return brand+","+price+","+engineCc+","+color+","+isSuperBike+","+chaseNumber;
	}
	

}
