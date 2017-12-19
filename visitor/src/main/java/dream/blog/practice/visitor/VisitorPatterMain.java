package dream.blog.practice.visitor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import dream.blog.practice.visitor.model.CorporateCustomer;
import dream.blog.practice.visitor.model.Customer;
import dream.blog.practice.visitor.model.InvdividualCustomer;

public class VisitorPatterMain {
	public static void main(String[] args) {
		Collection<Customer> customers = getMockCustomers();
		Iterator<Customer> it = customers.iterator();
		while(it.hasNext()) {
			Customer c = it.next();
			c.provideService();
			c.requirementAnalysis();
			c.valueAnalysis();
		}
	}
	
	private static Collection<Customer> getMockCustomers(){
		Collection<Customer> customers = new ArrayList<>();
		Customer c1 = new InvdividualCustomer();
		Customer c2 = new CorporateCustomer();
		customers.add(c1);
		customers.add(c2);
		return customers;
	}
}

