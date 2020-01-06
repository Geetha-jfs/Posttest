package com.ordertracking;

public class Application {
	public static void main(String []args)
	{
SpecialOrder order1 = new SpecialOrder(1,1,"Shirt","20-12-2019");
		System.out.println(order1);
		order1.confirm();
		order1.close();
		order1.dispatch();
		
		NormalOrder order2 = new NormalOrder(1,1,"Kurti","12-12-2019");
		System.out.println(order2);
		order2.confirm();
		order2.close();
		order2.dispatch();

}
}
