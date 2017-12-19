package dream.blog.practice.visitor;

import dream.blog.practice.visitor.model.CorporateCustomer;
import dream.blog.practice.visitor.model.Customer;
import dream.blog.practice.visitor.model.IndividualCustomer;
import dream.blog.practice.visitor.model.ObjectStructure;
import dream.blog.practice.visitor.model.ServiceProviderVisitor;
import dream.blog.practice.visitor.model.Visitor;

public class VisitorPatterMain {
	public static void main(String[] args) {
		ObjectStructure os = new ObjectStructure();
		Customer c1 = new IndividualCustomer();
		Customer c2 = new CorporateCustomer();
		c1.setName("王老板");
		c2.setName("鴻海");
		os.addCustomer(c1);
		os.addCustomer(c2);
		
		Visitor visitor = new ServiceProviderVisitor();
		os.handle(visitor);
	}
}

