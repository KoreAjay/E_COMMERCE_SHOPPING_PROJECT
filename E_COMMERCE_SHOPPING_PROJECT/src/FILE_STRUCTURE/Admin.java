package FILE_STRUCTURE;

import java.util.HashMap;
import java.util.UUID;

public class Admin {
private Inventory inventory;
private HashMap<UUID,Product> prooducts=new HashMap<>();
private HashMap<UUID,Integer> stockLevel=new HashMap<>();
private HashMap<UUID,Customer> customers=new HashMap<>();
private HashMap<UUID,Order> orders=new HashMap<>();

public Admin() {}

void addProduct(Product product) {prooducts.put(product.getProductID(),product);}

void updateProduct(Product product) {
	prooducts.put(product.getProductID(),product);
	
}


public void updateStocklevel(Product product,int stockLevel) {
	Product p=prooducts.get(product.getProductID());
	p.setStockLevel(stockLevel);
	
}

void addOrder(Order order) {
	orders.put(order.getOrderID(),order);
	
}

void updateOrder(Order orderToUpdate) {
	orders.put(orderToUpdate.getOrderID(),orderToUpdate);
	
}
void addCustomer(Customer customer) {
	customers.put(customer.getCustomerID(),customer);
}
void updateCustomer(Customer CustomerToUpdate) {
	customers.put(CustomerToUpdate.getCustomerID(),CustomerToUpdate);
}


}

