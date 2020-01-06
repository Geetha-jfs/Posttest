package com.ordertracking;

public abstract class Order {
	int orderId;
	 int quantity;
	 String orderItem;
	 
	 Order(){
		// System.out.println("Default Constructor");
	 }
 
	 public Order(int porder_id, int pquantity, String porderItem) {
		this.orderId = porder_id;
		this.quantity = pquantity;
		this.orderItem = porderItem;
	}

	

	 public void confirm() {
		 System.out.println("Your order is confirmed");
	 }
	 public void close()
	 {
		 System.out.println("Your order is closed");
	 }
	 
}
