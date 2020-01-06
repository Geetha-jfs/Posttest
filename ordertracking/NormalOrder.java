package com.ordertracking;

public class NormalOrder extends Order {
	String date;
	public NormalOrder(int porderId, int pquantity, String porderItem,String pdate) {
		super();
		this.orderId = porderId;
		this.quantity = pquantity;
		this.orderItem = porderItem;
		this.date= pdate;
	}
	@Override
	public String toString() {
		return "NormalOrder [date=" + date + ", orderId=" + orderId + ", quantity=" + quantity + ", orderItem="
				+ orderItem +"]";
	}
	public void confirm() {
		 System.out.println("Your normal order is confirmed");
	 }
	 public void close()
	 {
		 System.out.println("Your normal order is closed");
	 }
	 
	 public void dispatch()
	 {
		 System.out.println("Your normal order has been dispatched");
	 }

}

