package FILE_STRUCTURE;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class ShoppingCart {
private HashMap<UUID,Product>products=new HashMap<>();

public ShoppingCart() {}

public void addProduct(Product product) {
	products.put(product.getProductID(),product);
	
}
public void removeProduct(Product product)
{
	products.remove(product.getProductID());
}
public int returnSize() {
	return products.size();
}

public double totalCost() {
	double total =0;
	for(Map.Entry<UUID, Product>entry:products.entrySet()){
		
		UUID productId=entry.getKey();
		Product product=entry.getValue();
		total+= product.getPrice();
		
	}
return total;
	}
}

