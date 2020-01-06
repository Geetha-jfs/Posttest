package com.ordertracking;

public class Customer {
public int customerId;
String customerName;

Customer()
{}

public Customer(int pcustomerId, String pcustomerName) {
	this.customerId = pcustomerId;
	this.customerName = pcustomerName;
}
public void sendOrder()
{
	System.out.println("Your order has been sent");
	}
public void receiveOrder()
{
	System.out.println("Your order has been received");
	}

@Override
public String toString() {
	return "Customer [customerId=" + customerId + ", customerName=" + customerName + "]";
}


}
