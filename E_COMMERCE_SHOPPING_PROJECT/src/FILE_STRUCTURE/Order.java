package FILE_STRUCTURE;

import java.util.ArrayList;
import java.util.UUID;

public class Order {

	private UUID orderID;
	private Customer custmer;
	private double totalCost;
	private Payment payment;
	private Shipping shipping;
	
	public Order(Customer custmer,ArrayList<Product>products,double totalCost,Payment payment,Shipping shipping) {
		this.orderID=UUID.randomUUID();
		this.custmer=custmer;
		this.totalCost=totalCost;
		this.payment=payment;
		this.shipping=shipping;
	}
	
	public UUID getOrderID() {	return orderID;}
	
	public Customer getCustomer() {	return custmer;}
	
	
	public ArrayList<Product>getProducts(){ return getProducts(); }

	 double getTotalCost() {return totalCost;}
		
	public Payment getPayment() {return payment;}
	
	public Shipping getShipping() {return shipping;}
		
	void setCustomer( Customer custmer) {	this.custmer=custmer;}
	
	void setProducts(ArrayList<Product>products) {this.totalCost=totalCost;}
	
	void setTotalCost(double totalCost) {this.totalCost=totalCost;}
	
	void setPayment(Payment payment) {this.payment=payment;}
	
	void setShipping(Shipping shipping) {this.shipping=shipping;}
	
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj==null||getClass()!=obj.getClass()) {
			return false;
		}
		return false;
	}
	
	
	
	
}
