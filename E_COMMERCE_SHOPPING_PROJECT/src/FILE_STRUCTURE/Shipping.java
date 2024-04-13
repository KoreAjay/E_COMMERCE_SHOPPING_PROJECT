package FILE_STRUCTURE;

public class Shipping {
	private String shippingMethod;
	private double shippingCost;
	
	public Shipping() {}
	
	public Shipping(String shippingMethod, double shippingCost)
	{
		this.shippingMethod=shippingMethod;
		this.shippingCost=shippingCost;
	}
	public String getShippingMethod() {
		return shippingMethod;
		
	}
	public double getShippingCost() {
		return shippingCost;
	}
	void setshippingMethod(String shippingMethod)
	{
		this.shippingMethod=shippingMethod;
		
	}
	void setShippingCost(double shippingCost)
	{
		this.shippingCost=shippingCost;
	}
}
