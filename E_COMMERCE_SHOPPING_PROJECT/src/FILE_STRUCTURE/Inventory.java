package FILE_STRUCTURE;

import java.util.HashMap;
import java.util.UUID;

public class Inventory {
private HashMap<UUID,Integer> products=new HashMap<>();

public Inventory() {}

public void addProduct(Product product,int stock) {
	products.put(product.getProductID(), stock);
	
}
public void updatStock(Product product, int stock) {
	products.replace(product.getProductID(),stock);
}

public boolean inStock(Product product) {
	int value=products.get(product.getProductID());
	if(value>0)
	{
	return true;
	}
	return false;
}
public void reStock(Product product,int quentity) {
	int value=products.get(product.getProductID());
	value+=quentity;
	products.replace(product.getProductID(),value);
	
}

}
