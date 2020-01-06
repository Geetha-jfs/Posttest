package com.ordertracking2;
import java.util.ArrayList;
import java.util.List;

import com.ordertracking.Customer;

public class ArrayListCustomer {
	 static List<Customer> customers = new ArrayList<Customer>();
		public static void main(String[] args) {
			start();
			addCustomer();
		Customer customernew= new Customer(3,"Manoj");
		updateCustomer(customernew );
			findCustomer(4);
			deleteCustomer(1);
		}
	
		private static void start() {
			Customer customer1= new Customer(1,"Ram");
			customers.add(customer1);
		
		}
		
			private static void addCustomer() {
				 Customer customer2= new Customer(2,"Ravi");
      	customers.add(customer2);
      	Customer customer3= new Customer(3,"Mahesh");
			customers.add(customer3);
			Customer customer4= new Customer(4,"Jay");
			customers.add(customer4);
			Customer customer5= new Customer(5,"Hari");
		customers.add(customer5);
			System.out.println(customers);
			}
			
			private static void updateCustomer(Customer customer)
			{
				//Customer cust1= new Customer(5,"Hari");
				//Customer cust1 = (Customer)customers.get(cust1.customerId);
				//if(cust1!= null )
				//{
					customers.set(cust1.customerId, customer);
					System.out.println("Updated customer : " + customer);
				//}
				//else {
					//System.out.println("Customer not found!");
				//}
			}
			
			private static void findCustomer(int customerId) {
				Customer cust = (Customer)customers.get(customerId);
				if( cust!= null) {
					System.out.println("Found Customer : " + cust);
				}
				else {
					System.out.println("Customer not found!");
				}
			}


			private static void deleteCustomer(int customerId) {
				Customer cust = (Customer)customers.get(customerId);
				if(cust != null) {
					customers.remove(customerId);
					System.out.println("Customer Deleted");
					System.out.println(customers);
				}
				else
				{
					System.out.println("Customer not found!");
			}
			
			}		
}
				
				
				
				
				
				
				
				
				
				
				
				
				
