package bank.db;

public class Customer 
{
	private int actno,amount;
	private String name;
	
	public int getActno()
	{
		return actno;
	}
	public void setActno(int actno) 
	{
		this.actno = actno;
	}
	public int getAmount()
	{
		return amount;
	}
	public void setAmount(int amount) 
	{
		this.amount = amount;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
}
