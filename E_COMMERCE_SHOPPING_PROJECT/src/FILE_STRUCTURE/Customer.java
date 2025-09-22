package FILE_STRUCTURE;

import java.util.UUID;
public class Customer {
private static final boolean ture = false;
private UUID customerID;
private String name;
private String address;
private String email;


public Customer()
{
	name="";
	address="";
	email="";
	
}

public Customer(String name,String address,String email) {
	this.customerID=UUID.randomUUID();
	this.name=name;
	this.address=address;
	this.email=email;
	
}

public UUID getCustomerID() {
	return customerID;
	
}
public String getName() {
	return name;
	
}
public String getAddress() {
	return address;
			
}
public String getEmail() {
	return email;
}

public void setName(String name)
{
	this.name=name;
}
public void setAddress(String address)
{
	this.address=address;
}
public void setEmail(String email)
{
	this.email=email;
}
public boolean equals(Object obj) {
	if(this==obj)
	{
		return ture;
	}
	if(obj==null||getClass()!=obj.getClass()) {
		return false;
	}
	Customer otherCustmer=(Customer) obj;
	return customerID.equals(otherCustmer.customerID);
			
}

}


