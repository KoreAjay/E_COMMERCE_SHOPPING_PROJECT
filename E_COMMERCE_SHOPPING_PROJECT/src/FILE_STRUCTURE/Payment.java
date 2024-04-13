package FILE_STRUCTURE;

import java.util.UUID;

interface PaymentMethod {
void processPayment(double amount);

}
 class CreditCardPayment implements PaymentMethod{
	private String cardNumber;
	private String cardHolderName;
	
	public CreditCardPayment(String cardNumber,String cardHolderName) {
		this.cardNumber=cardNumber;
		this.cardHolderName=cardHolderName;
		
	}
	public void processPayment(double amount)
	{
		System.out.println("Processing credit card payment of $"+amount);
	}
}
 class DebitCardpayment implements PaymentMethod{
	 private String cardNumber;
	 private String cardHolderName;
	 
	 public DebitCardpayment(String cardNumber ,String cardHolderName)
	 {
		 this.cardNumber=cardNumber;
		 this.cardHolderName=cardHolderName;
		 
	 }
	 public void processPayment(double amount) {
		 System.out.println("Processing debit card payment of $"+amount);
	 }
 }

 
 
 
 class Payment{
	 private UUID paymentID;
	 private double amount;
	 private String paymentMethod;
	 
	public Payment() {}
	public Payment(double amount,String paymentMethod) {
		this.amount=amount;
		this.paymentMethod=paymentMethod;
	
	}
	public UUID getPaymentID() {
		return paymentID;
		
	}
	public double getAmount() {
		return amount;
		
	}
	public String getPaymentMethod() {
		return paymentMethod;
		
	}
	
	public void SetAmount(double amount)
	{
		this.amount=amount;
		
	}
	public void SetPaymentMethod(String paymentMethod) {
		this.paymentMethod=paymentMethod;
	}
	public void makePayment() {
		
	}
 }