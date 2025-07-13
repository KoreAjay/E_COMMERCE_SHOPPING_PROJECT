package FILE_STRUCTURE;

public class Main {
public static void main(String[] args) {
	Product p1=new Product("iphone","New iphone",999.99,10);
	
	Inventory inventory=new Inventory();
	inventory.addProduct(p1,10);
	
	Customer c1=new Customer("John Smith","123 Main  St","johnmith@gmail.com");
	
	ShoppingCart cart=new ShoppingCart();
	
	cart.addProduct(p1);
	
	if(inventory.inStock(p1))
	{
		System.out.println("Product is in stock");
	}
	else
	{
		
		System.out.println("product id out of stock ");
	}
	
	System.out.println("Total cost :Rs:"+cart.totalCost());
	
	Payment payment=new Payment(cart.totalCost(),"Credit Card");
	
	System.out.println("Payment amount :Rs"+payment.getAmount());
	System.out.println("payment method :"+payment.getPaymentMethod());
	
	
}
}
