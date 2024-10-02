
public class Product{
	private String name;
	private int price;
	private int quantity;
	private String id;

	Product(String name, int price, int quantity){
		this.name = name;
		this.price = price;
		this.quantity = quantity; 
	} 


	Product()
	{
			
	}

	public String getname(){
		return name;
	}

	public void setprice(int price)
	{
		this.price=price;
	} 
	public int getprice()
	{
		return price;

	public void setName(String name){
		this.name = name;	

	}
	
}