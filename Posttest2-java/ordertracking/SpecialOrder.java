package com.ordertracking;

public class SpecialOrder extends Order {
	String date;
	public SpecialOrder(int porderId, int pquantity, String porderItem,String pdate) {
		super();
		this.orderId = porderId;
		this.quantity = pquantity;
		this.orderItem = porderItem;
		this.date= pdate;
	}
	@Override
	public String toString() {
		return "SpecialOrder [date=" + date + ", order_id=" + orderId + ", quantity=" + quantity + ", orderItem="
				+ orderItem +"]";
	}
	
	 public void confirm() {
		 System.out.println("Your special order is confirmed");
	 }
	 public void close()
	 {
		 System.out.println("Your special order is closed");
	 }
	 
	 public void dispatch()
	 {
		 System.out.println("Your special order has been dispatched");
	 }
}
