package collection;

public class Customer {
	private String name;
	private int age;
	private String email;
	private int amountAvailable;
	private long adharNumber;
	private String panNumber;
	public void setName(String name)
	{
		this.name=name;
		
	}
	public String getName()
	{
		return name;
		
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public int getAge()
	{
		return age;
	}
	public void setEmail(String email)
	{
		this.email=email;
		
	}
	public String getEmail()
	{
		return email;
	}
	public void setAmountavailable(int amountAvailable)
	{
		this.amountAvailable=amountAvailable;
	}
	public int getAmountavailable()
	{
		return amountAvailable;
	}
	public void setAdharnumber(long adharNumber)
	{
		this.adharNumber=adharNumber;
	}
	public long getAdharnumber()
	{
		return adharNumber;
	}
	public void setPannumber(String panNumber)
	{
		this.panNumber=panNumber;
	}
	public String getPannumber()
	{
		return panNumber;
	}
	public Customer(String name,int age,String email,int amountAvailable,long adharNumber,String panNumber)
	{
		this.name=name;
		this.age=age;
		this.email=email;
		this.amountAvailable=amountAvailable;
		this.adharNumber=adharNumber;
		this.panNumber=panNumber;
	}
	public String toString()
	
	{
		return name+","+age+","+email+","+amountAvailable+","+adharNumber+","+panNumber;
	}

}
