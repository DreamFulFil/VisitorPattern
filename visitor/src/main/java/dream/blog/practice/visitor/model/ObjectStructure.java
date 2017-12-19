package dream.blog.practice.visitor.model;

import java.util.ArrayList;
import java.util.Collection;

public class ObjectStructure {
	private Collection<Customer> customers = new ArrayList<>();
	public void handle(Visitor visitor) {
		for(Customer c:customers) {
			c.accept(visitor);
		}
	}
	public void addCustomer(Customer c) {
		this.customers.add(c);
	}
}
